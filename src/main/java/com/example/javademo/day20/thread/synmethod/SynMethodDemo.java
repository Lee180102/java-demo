package com.example.javademo.day20.thread.synmethod;

public class SynMethodDemo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.setNum(100);
        SellTicket st = new SellTicket(ticket);
        new Thread(st).start();
        new Thread(st).start();
    }
}
class SellTicket implements Runnable{
    private Ticket ticket;

    public SellTicket(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while(true){
            synchronized (SellTicket.class){
                if (ticket.getNum()>0){
                    System.out.println(ticket.getNum());
                    //当卖出去一张票 剩余的票数减一
                    ticket.setNum(ticket.getNum()-1);
                }
            }
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
