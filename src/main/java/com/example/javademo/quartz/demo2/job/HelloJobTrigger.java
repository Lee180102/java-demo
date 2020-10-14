package com.example.javademo.quartz.demo2.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Trigger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloJobTrigger implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // 获取时间
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = dateFormat.format(date);
        // 工作内容
        System.out.println("正在进行数据库的备份工作，备份数据库时间是：" + dateString);

        // 获取触发器的jobKey、startTime、endTime
        Trigger trigger = context.getTrigger();
        System.out.println("触发器的jobKey名称："+trigger.getJobKey().getName()+";   jobKey组名称:" + trigger.getJobKey().getGroup()+ ";");
        System.out.println("触发器任务的开始时间："+dateFormat.format(trigger.getStartTime()));
        System.out.println("触发器任务的结束时间："+dateFormat.format(trigger.getEndTime()));
    }
}
