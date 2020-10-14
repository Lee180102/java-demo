package com.example.javademo.quartz.listener.scheduler.listener;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
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
            //创建并注册一个全局的Job Listener
//           scheduler.getListenerManager().addTriggerListener(new MyTriggerListener(), EverythingMatcher.allTriggers());
            //创建并注册一个局部的Job Listener
            scheduler.getListenerManager().addTriggerListener(new MyTriggerListener(), KeyMatcher.keyEquals(TriggerKey.triggerKey("1", "1")));
            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
