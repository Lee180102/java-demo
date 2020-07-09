package com.example.javademo.day20.thread;

import java.util.concurrent.*;

public class ThreadDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程服务对象
        ExecutorService es = Executors.newCachedThreadPool();
        //创建线程并运行线程
        Future<String> future = es.submit(new MyThread2());
        //打印返回值
        System.out.println(future.get());
    }
}
//定义线程类
class MyThread2 implements Callable<String>{

    @Override
    public String call() throws Exception {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
        }
        return "hello~";
    }
}