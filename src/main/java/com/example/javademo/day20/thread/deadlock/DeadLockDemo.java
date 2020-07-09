package com.example.javademo.day20.thread.deadlock;

public class DeadLockDemo {
    private static Printer printer = new Printer();
    private static Scanner scanner = new Scanner();

    public static void main(String[] args) {
        //代表第一个员工 先打印再扫描
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (printer){
                        System.out.print(Thread.currentThread().getName());
                        //打印内容
                        printer.print();
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (scanner){
                            System.out.print(Thread.currentThread().getName());
                            scanner.scan();
                        }
                    }

                }
            }
        }).start();
        //代表第二个员工  先扫描 再打印
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (scanner){
                        System.out.print(Thread.currentThread().getName());
                        //打印内容
                        scanner.scan();
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (printer){
                            System.out.print(Thread.currentThread().getName());
                            printer.print();
                        }
                    }

                }
            }
        }).start();
    }

}
//打印机
class Printer{
    //提供了打印的方法
    public void print(){
        System.out.println("打印机正在打印~~~");
    }
}
//扫描仪
class Scanner{
    //提供扫描的方法
    public void scan(){
        System.out.println("扫描仪正在扫描~~");
    }
}