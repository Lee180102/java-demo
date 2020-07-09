package com.example.javademo.day20.thread;

public class ThreadDemo2 {
    public static void main(String[] args){
        //创建线程类的对象
        MyThread1 my1 = new MyThread1();
        //创建Thread类对象
        Thread t1 = new Thread(my1);
        //调用start方法启动线程
        t1.start();
    }
}

//自定义MyThread1实现Runnable接口
class MyThread1 implements Runnable{
    //实现run方法
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
