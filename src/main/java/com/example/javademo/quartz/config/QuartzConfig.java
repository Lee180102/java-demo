package com.example.javademo.quartz.config;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    //定义任务详情
    @Bean
    public JobDetail quartzJobDetail() {
        //指定job的名称和持久化保存任务
        return JobBuilder
                .newJob(TestQuartz.class)//指定一个全新的任务
                .withIdentity("testQuartz")//指定任务名称
                .storeDurably()
                .build();//任务创建 封装为JobDetail对象
    }
    //定义触发器
    @Bean
    public Trigger testTrigger() {

        //定义调度器 周期的执行的时间
//        SimpleScheduleBuilder builder = SimpleScheduleBuilder.
//                simpleSchedule().
//                withIntervalInMinutes(1). //定义事件周期
//                repeatForever();
        //定义调度器  指定任务的执行的时间
        CronScheduleBuilder builder = CronScheduleBuilder.cronSchedule("0 0/1 * * * ?");
        return TriggerBuilder.newTrigger().forJob(quartzJobDetail()).withIdentity("testQuartz").withSchedule(builder).build();

    }
}
