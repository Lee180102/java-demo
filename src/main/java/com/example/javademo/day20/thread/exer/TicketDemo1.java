package com.example.javademo.day20.thread.exer;

public class TicketDemo1 {
    public static void main(String[] args) {
        SellTicket1 st1 = new SellTicket1();
        //创建线程对象
//        Thread t1 = new Thread(st1,"窗口1");
//        Thread t2 = new Thread(st1,"窗口2");
//        //启动线程
//        t1.start();
//        t2.start();
        //简化代码
        new Thread(st1,"窗口1").start();
        new Thread(st1,"窗口2").start();
        new Thread(st1,"窗口3").start();

    }
}
class SellTicket1 implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while(ticket>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"当前正在卖第"+ticket+"张票");
            ticket--;
        }
    }
}
