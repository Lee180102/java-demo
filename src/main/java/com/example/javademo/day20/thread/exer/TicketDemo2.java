package com.example.javademo.day20.thread.exer;

public class TicketDemo2 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.setNum(100);
        SellTicket2 st1 = new SellTicket2(ticket);
//        SellTicket2 st1 = new SellTicket2();
        new Thread(st1,"窗口1").start();
        new Thread(st1,"窗口2").start();
        new Thread(st1,"窗口3").start();

    }
}

class SellTicket2 implements Runnable{
//    private int ticket = 100;
//    private Object o = new Object();
    private static Ticket ticket;

    public SellTicket2(Ticket ticket){
        this.ticket = ticket;
    }
//    private Object o = new Object();//0x0001
    @Override
    public void run() {
        //0x0001 0x0002
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /*synchronized (o){
                if(ticket>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"当前正在卖第"+ticket+"张票");
                    ticket--;
                }
            }*/
            sell();
        }
    }
    public static synchronized void sell(){
            if(ticket.getNum()>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"当前正在卖第"+ticket.getNum()+"张票");
                ticket.setNum(ticket.getNum()-1);
            }
    }
}
class Ticket{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
