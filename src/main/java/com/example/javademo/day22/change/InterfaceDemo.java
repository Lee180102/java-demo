package com.example.javademo.day22.change;

public class InterfaceDemo {
    public static void main(String[] args) {
//        A.method1();//static修饰可以调用
    }
}
interface A{
    public void method();//抽象方法
    /*static void method1(){
        System.out.println("aaa");
    }*/
    default void method1(){
        System.out.println("aaa");
    }
}
class A1 implements A{

    @Override
    public void method() {
//        method1();//default修饰的方法可以直接使用
    }
}
