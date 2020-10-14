package com.example.javademo.quartz.properties;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Properties;

public class QuartzProperties {
    public static void main(String[] args)  {
        // 创建工厂实例
        StdSchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = null;
//        Properties properties = new Properties();
//        properties.put(StdSchedulerFactory.PROP_THREAD_POOL_CLASS,"org.quartz.simpl.SimpleThreadPool");
//        properties.put("org.quartz.threadPool.threadCount","5");
        try {
            // 根据配置的属性创建实例
//            schedulerFactory.initialize(properties);
            scheduler = schedulerFactory.getScheduler();
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
