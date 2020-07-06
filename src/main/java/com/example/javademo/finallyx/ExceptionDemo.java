package com.example.javademo.finallyx;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception{
        Person p = new Student();
        p.method();//编译看左边父类 运行时看右边子类
    }
}

class Person{
    public void method() throws Exception{
        System.out.println("Person..");
    }
}
class Student extends Person{
    @Override
    public void method() throws ParseException{
        DateFormat d = new SimpleDateFormat("yyyy-MM-dd");
        d.parse("2019-12-17");
        System.out.println("Student");
    }
}
