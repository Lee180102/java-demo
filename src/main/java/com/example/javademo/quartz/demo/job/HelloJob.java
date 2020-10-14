package com.example.javademo.quartz.demo.job;

import com.example.javademo.day22.reflect.DataBaseDemo;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.PersistJobDataAfterExecution;
import org.quartz.TriggerKey;

import javax.security.auth.login.Configuration;
import java.text.SimpleDateFormat;
import java.util.Date;

@PersistJobDataAfterExecution // 多次调用Job的时候，回对Job进行持久化，就会保存一个数据信息
public class HelloJob implements Job {
//  public HelloJob() {
//        System.out.println("Hello Job");
//    }

    private String message;

    private Integer count;
    public void setMessage(String message) {
        this.message = message;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //输出当前时间
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = dateFormat.format(date);
        // 获取jobDetail的内容
        JobKey key = jobExecutionContext.getJobDetail().getKey();
        System.out.println("工作任务名称：" + key.getName() + "   ;工作组的名称：" + key.getGroup() + "    ;");
        System.out.println("任务类的名称：" + jobExecutionContext.getJobDetail().getJobClass().getName());
        System.out.println("任务类的简称：" + jobExecutionContext.getJobDetail().getJobClass().getSimpleName());
        // 获取jobDetail的内容
        TriggerKey triggerKey = jobExecutionContext.getTrigger().getKey();
        System.out.println("触发器名称：" + triggerKey.getName() + "   ;工作组的名称：" + triggerKey.getGroup() + "    ;");
        // 从jobDetail获取jobDataMap的数据
//        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
//        String jobDataMessage = jobDataMap.getString("message");
//        System.out.println("任务数据的参数值：" + jobDataMessage);
        // 从trigger获取jobDataMap的数据
//        JobDataMap triggerDataMap = jobExecutionContext.getTrigger().getJobDataMap();
//        String triggerDataMessage = triggerDataMap.getString("message");
//        System.out.println("触发器数据的参数值：" + triggerDataMessage);
        // 从setter方法中读取message的值
        // ** 如果任务和触发器的key相同，触发器的值会覆盖任务的值
        System.out.println("参数值：" + message);
        // 获取其他内容
        System.out.println("任务执行时间：" + dateFormat.format(jobExecutionContext.getFireTime()));
        System.out.println("下次任务执行时间：" + dateFormat.format(jobExecutionContext.getNextFireTime()));
        //工作内容
        System.out.println("正在进行数据库的备份工作，备份数据库时间是：" + dateString);
        ++count;//count值增加
        //打印count的值；
        System.out.println("count的值："+ count);
        //将count的新的值放到JobDetail
        jobExecutionContext.getJobDetail().getJobDataMap().put("count",count);
    }
}
