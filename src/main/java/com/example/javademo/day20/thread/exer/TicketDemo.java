package com.example.javademo.day20.thread.exer;
/*
    三个窗口同时售票
 */
public class TicketDemo {
    public static void main(String[] args) {
        SellTicket thread = new SellTicket();
        SellTicket thread1 = new SellTicket();

        thread.setName("窗口1");
        thread1.setName("窗口2");

        //启动线程
        thread.start();
        thread1.start();
    }
}
class SellTicket extends Thread{
    private static int ticket = 100;

    /*public SellTicket(String name){
        super(name);
    }*/
    @Override
    public void run() {
        while(ticket>0){
            System.out.println(Thread.currentThread().getName()+"当前正在卖第"+ticket+"张票");
            ticket--;
        }
    }
}
