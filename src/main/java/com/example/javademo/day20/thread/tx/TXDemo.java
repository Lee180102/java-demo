package com.example.javademo.day20.thread.tx;

public class TXDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "翠花";
        stu.gender = '女';
        //启动问问题的线程
        new Thread(new AskProblem(stu)).start();
        //启动切换学生的线程
        new Thread(new Change(stu)).start();
    }
}

class AskProblem implements Runnable{
    private Student student;
    public AskProblem(Student student){
        this.student = student;
    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (student){
                //如果上一次已经打印过了 希望在这里停一下
                while(!student.flag){
                    try {
                        student.wait();//当线程执行到本行代码时，会进入等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(student.name+","+student.gender+"在问问题~~");
                student.notify();//唤醒一个正在等待的线程
                student.flag = false;
            }
        }
    }
}

class Change implements Runnable{
    private Student student;
    public Change(Student student){
        this.student = student;
    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (student){

                //如果上一次已经改变过学生信息了，那希望在这里停一下
                while(student.flag){
                    try {
                        student.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(student.gender=='男'){
                    student.name = "翠花";
                    student.gender = '女';
                }else{
                    student.name = "二狗子";
                    student.gender = '男';
                }
                student.notify();
                student.flag = true;
            }
        }
    }
}

class Student{
    String name;//姓名
    char gender;//性别
    //标记位 因为目前已有的属性无法满足程序需求
    boolean flag = true;//如果flag为true，则执行问问题的线程
}
