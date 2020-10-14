package com.example.javademo.quartz.demo2.main;

import com.example.javademo.quartz.demo.job.HelloJob;
import com.example.javademo.quartz.demo2.job.HelloJobTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

public class HelloSchedulerDemoTrigger {
    public static void main(String[] args) throws SchedulerException {
        //任务的开始时间
        Date startDate = new Date();
        //任务的结束时间
        Date endDate = new Date();
        endDate.setTime(startDate.getTime()+10000);
        // 调度器 Scheduler ，从工厂中获取调度的实例
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        // 任务实例 JobDetail
        JobDetail jobDetail = JobBuilder.newJob(HelloJobTrigger.class)// 加载任务类，与HelloJob完成绑定，要求HelloJob要实现Job接口；
                .withIdentity("job1", "group1")// 参数1： 任务的名称（唯一实例）；参数2：任务组的名称，可以将任务分组
                .usingJobData("message","job传递的参数")
                .build();
        //调度器策略
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever();
        // 触发器 Trigger
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1", "triggerGroup1")// 参数1： 触发器的名称（唯一实例）；参数2：触发器的组的名称，可以将任务分组
//                .startNow()
                .withSchedule(scheduleBuilder)
                .startAt(startDate)//任务的开始时间
                .endAt(endDate)//任务的结束时间
                .build();
        //让调度器关联任务和触发器，保证按照触发器定义的条件执行；
        scheduler.scheduleJob(jobDetail,trigger);
        //启动
        scheduler.start();
    }
}
