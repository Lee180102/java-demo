package com.example.javademo.day21.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
//        RWGlq r = new RWGlq();
//        RWGlq r1 = new RWGlq();
        //通过调用getInstance获取到的是同一个对象
        //保证了对象的单例性
//        RWGlq r = RWGlq.getInstance();
//        RWGlq r1 = RWGlq.getInstance();
//        System.out.println(r==r1);
    }
}
//任务管理器类
//饿汉式
/*class RWGlq{
    //定义当前类的一个对象
    private static RWGlq rwGlq = new RWGlq();
    //不能通过new创建对象 所以构造方法私有化
    private RWGlq(){}
    //提供公开的方法 返回rwGlq
    public static RWGlq getInstance(){
        return rwGlq;
    }
}*/
//懒汉式
class RWGlq{
    //定义当前类的一个对象
    private static RWGlq rwGlq = null;
    //不能通过new创建对象 所以构造方法私有化
    private RWGlq(){}
    //提供公开的方法 返回rwGlq
    public static synchronized RWGlq getInstance(){
            //当需要获取当前对象时 才来创建
        if(rwGlq==null){
            rwGlq = new RWGlq();
        }
        return rwGlq;
    }
}
