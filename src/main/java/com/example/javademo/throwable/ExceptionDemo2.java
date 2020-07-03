package com.example.javademo.throwable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
    public static void main(String[] args) throws ParseException {
        method();
    }

    public static void method()  throws ParseException{
//        DateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        DateFormat format= new SimpleDateFormat("yyyy/MM/dd");
        Date date = format.parse("20191214");
        System.out.println(date);

        System.out.println("hello");
    }
}
