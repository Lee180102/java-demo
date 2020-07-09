package com.example.javademo.day20.thread.tx;

public class TXDemo1 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "翠花";
        stu.gender = '女';
        //启动问问题的线程
        new Thread(new AskProblem1(stu)).start();
        //启动切换学生的线程
        new Thread(new Change1(stu)).start();
        //启动问问题的线程
        new Thread(new AskProblem1(stu)).start();
        //启动切换学生的线程
        new Thread(new Change1(stu)).start();
    }
}

class AskProblem1 implements Runnable{
    private Student student;
    public AskProblem1(Student student){
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
                student.notifyAll();//唤醒全部正在等待的线程
                student.flag = false;
            }
        }
    }
}

class Change1 implements Runnable{
    private Student student;
    public Change1(Student student){
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
                student.notifyAll();//唤醒全部等待的线程
                student.flag = true;
            }
        }
    }
}

