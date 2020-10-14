package com.example.javademo.quartz.demo3.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Trigger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloJobSimpleTrigger implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // 获取时间
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = dateFormat.format(date);
        // 工作内容
        System.out.println("正在进行数据库的备份工作，备份数据库时间是：" + dateString);
    }
}