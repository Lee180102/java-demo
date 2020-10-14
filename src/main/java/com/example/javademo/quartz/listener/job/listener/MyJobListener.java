package com.example.javademo.quartz.listener.job.listener;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class MyJobListener implements JobListener {

    //监听器名称
    @Override
    public String getName() {
        String name = this.getClass().getSimpleName();
        System.out.println("监听器的名称是：" + name + "！");
        return name;
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext jobExecutionContext) {
        String name = jobExecutionContext.getJobDetail().getKey().getName();
        System.out.println("Scheduler在JobDetail即将被执行时调用的方法！Job的名称是" + name + "！");
    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext jobExecutionContext) {
        String name = jobExecutionContext.getJobDetail().getKey().getName();
        System.out.println("Scheduler在JobDetail即将被执行时,但是又被TriggerListener否决时调用的方法！Job的名称是" + name + "！");
    }

    @Override
    public void jobWasExecuted(JobExecutionContext jobExecutionContext, JobExecutionException e) {
        String name = jobExecutionContext.getJobDetail().getKey().getName();
        System.out.println("Scheduler在JobDetail被执行之后调用的方法！Job的名称是" + name + "！");
    }
}
