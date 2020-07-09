package com.example.javademo.day20.thread;

public class ThreadDemo4 {
    public static void main(String[] args) {
        MyThread3 t3 = new MyThread3("a");
        MyThread3 t4 = new MyThread3("b");
//        int num = t3.getPriority();
        t3.setPriority(5);
        t4.setPriority(6);
//        System.out.println(num);
        t3.start();
        t4.start();
    }
}
class MyThread3 extends Thread{

    public MyThread3(String name){
        super(name);
    }

    //重写run方法
    @Override
    public void run() {
        //循环打印数字
        for (int i = 0; i <=100; i++) {
            /*try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(getName()+":"+i);
        }
    }
}