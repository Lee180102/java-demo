package com.example.javademo.throwable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo4 {
//    public static void main(String[] args) throws ParseException,ArithmeticException{
//Exception 是异常的父类，子类对象父类可以引用
    //这种方式适合进行测试或者学习
    public static void main(String[] args) throws Throwable{
        DateFormat format= new SimpleDateFormat("yyyy/MM/dd");
        Date date = format.parse("20191214");
        System.out.println(date);

        System.out.println("hello");
        //运行时异常
        int a = 5;
        int b = 0;
        System.out.println(a/b);

        System.out.println("hello");
    }
}
