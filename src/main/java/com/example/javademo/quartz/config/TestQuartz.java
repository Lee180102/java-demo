package com.example.javademo.quartz.config;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
//准备定时任务
@Component
public class TestQuartz extends QuartzJobBean {
    @Override
    @Transactional
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {


        Calendar calendar = Calendar.getInstance();
        Date timeOut = calendar.getTime();
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        String format = dateFormat.format(timeOut);

        System.out.println(format+" 定时器触发！！！");
    }
}
