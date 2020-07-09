package com.example.javademo.day20.thread.daemon;

public class DemonDemo {
    public static void main(String[] args) {
       Thread t1 = new Thread(new Crystal());
       t1.setName("水晶");
        Thread t2 = new Thread(new Soldier());
        t2.setName("小兵1");
        Thread t3 = new Thread(new Soldier());
        t3.setName("小兵2");
        Thread t4 = new Thread(new Soldier());
        t4.setName("小兵3");

        //设置小兵线程为守护线程
        t2.setDaemon(true);
        t3.setDaemon(true);
        t4.setDaemon(true);

        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class Crystal implements Runnable{
    private int life = 200;
    @Override
    public void run() {

        for (int i = life; i >=0 ; i--) {
            synchronized (Crystal.class){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(Thread.currentThread().getName());
                System.out.println("当前血量为:"+i);
            }
        }

    }
}
class Soldier implements Runnable{
    private int life = 100;
    @Override
    public void run() {

        for(int i=life;i>=0;i--){
            synchronized (Soldier.class){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(Thread.currentThread().getName());
                System.out.println("当前血量为："+i);
            }
        }

    }
}
