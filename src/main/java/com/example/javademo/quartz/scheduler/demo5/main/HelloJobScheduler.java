package com.example.javademo.quartz.scheduler.demo5.main;

import com.example.javademo.quartz.demo3.job.HelloJobSimpleTrigger;
import com.example.javademo.quartz.scheduler.demo5.job.HelloJob;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloJobScheduler {
    public static void main(String[] args) throws SchedulerException, InterruptedException {
//        //任务的开始时间
//        Date startDate = new Date();
//        //任务的结束时间
//        Date endDate = new Date();
//        endDate.setTime(startDate.getTime()+10000);
//        // 调度器 Scheduler ，从工厂中获取调度的实例
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        // 任务实例 JobDetail
        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)// 加载任务类，与HelloJob完成绑定，要求HelloJob要实现Job接口；
                .withIdentity("job1", "group1")// 参数1： 任务的名称（唯一实例）；参数2：任务组的名称，可以将任务分组
                .usingJobData("message","job传递的参数")
                .build();
        //调度器策略
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("* * * * * ?");
        // 触发器 Trigger
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1", "triggerGroup1")// 参数1： 触发器的名称（唯一实例）；参数2：触发器的组的名称，可以将任务分组
                .startNow()
                .withSchedule(scheduleBuilder) //每五执行一次，秒执行三次
//                .startAt(startDate)//任务的开始时间
//                .endAt(endDate)
                .build();
        //让调度器关联任务和触发器，保证按照触发器定义的条件执行；
        Date date = scheduler.scheduleJob(jobDetail, trigger);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("调度器的开始时间是：" + dateFormat.format(date));
        //启动
        scheduler.start();
        // 两秒后挂起
        Thread.sleep(2000);
//        scheduler.standby();
        //关闭
//        scheduler.shutdown();
        scheduler.shutdown(true);
        // 三秒后重新启动任务
        Thread.sleep(3000);
        scheduler.start();
    }
}
