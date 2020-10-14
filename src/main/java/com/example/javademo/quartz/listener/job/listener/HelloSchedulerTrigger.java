package com.example.javademo.quartz.listener.job.listener;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.KeyMatcher;

public class HelloSchedulerTrigger {
    public static void main(String[] args) {
        try {
            Scheduler scheduler = new StdSchedulerFactory().getScheduler();
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("* * * * * ?");

            JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
                    .withIdentity("listenerJob1", "listenerJobGroup1")
                    .usingJobData("key", "value")
                    .build();
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("listenerTrigger1", "listenerTriggerGroup1")
                    .withSchedule(scheduleBuilder)
                    .startNow()
                    .build();
            scheduler.scheduleJob(jobDetail, trigger);
            //创建并注册一个全局的Job Listener
//            scheduler.getListenerManager().addJobListener(new MyJobListener(), EverythingMatcher.allJobs());
            //创建并注册一个局部的Job Listener
            scheduler.getListenerManager().addJobListener(new MyJobListener(), KeyMatcher.keyEquals(JobKey.jobKey("listenerJob2", "listenerJobGroup1")));
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
