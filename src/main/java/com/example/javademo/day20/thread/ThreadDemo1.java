package com.example.javademo.day20.thread;

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        //创建线程对象
        MyThread my = new MyThread("线程1");
        MyThread my1 = new MyThread("线程2");

        //启动线程
        my.start();
//        my.start();//一个线程只能启动一次
        my1.start();
//        my.run();
        for (int i = 0; i <=100; i++) {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
//        MyThread my1 = new MyThread();
//        my1.start();
    }
}
//自定义MyThread继承Thread
class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    //重写run方法
    @Override
    public void run() {
        //循环打印数字
        for (int i = 0; i <=100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+":"+i);
        }
    }
}
