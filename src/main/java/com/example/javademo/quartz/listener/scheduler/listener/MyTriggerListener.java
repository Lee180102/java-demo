package com.example.javademo.quartz.listener.scheduler.listener;


import org.quartz.JobExecutionContext;
import org.quartz.Trigger;
import org.quartz.TriggerListener;

public class MyTriggerListener implements TriggerListener {


    @Override
    public String getName() {
        String name = this.getClass().getSimpleName();
        System.out.println("触发器监听器的名称："+ name);
        return name;
    }

    @Override
    public void triggerFired(Trigger trigger, JobExecutionContext jobExecutionContext) {
        String name = trigger.getKey().getName();
        System.out.println(name+"被触发！");
    }

    @Override
    public boolean vetoJobExecution(Trigger trigger, JobExecutionContext jobExecutionContext) {
        String triggerName = trigger.getKey().getName();
        String jobName = jobExecutionContext.getJobDetail().getKey().getName();
        System.out.println("返回：false！"+triggerName+"被触发！"+jobName+"被执行！");
//        System.out.println("返回：true！"+triggerName+"被触发！"+jobName+"没有被执行！");
        return false;
    }

    @Override
    public void triggerMisfired(Trigger trigger) {
        String triggerName = trigger.getKey().getName();
        System.out.println(triggerName+"错过触发！");
    }

    @Override
    public void triggerComplete(Trigger trigger, JobExecutionContext jobExecutionContext, Trigger.CompletedExecutionInstruction completedExecutionInstruction) {
        String triggerName = trigger.getKey().getName();
        String jobName = jobExecutionContext.getJobDetail().getKey().getName();
        System.out.println(triggerName+"被触发！"+jobName+"被执行！");
    }
}
