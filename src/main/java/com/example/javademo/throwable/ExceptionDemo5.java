package com.example.javademo.throwable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo5 {
    public static void main(String[] args) throws ParseException,Exception{
        //ParseException 编译时异常
        /*try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse("2019");
            System.out.println(date);
            System.out.println("hello");

        }catch(ParseException e){
            System.out.println("格式转换错误");
        }

        System.out.println("=======================");

        //运行时异常
        int a = 5;
        int b = 0;
        try {
            System.out.println(a / b);
            System.out.println("aaaa");
        }catch(ArithmeticException e){
            System.out.println("除数不能为0！");
        }
        System.out.println("hello");*/


        //抛出多个异常 catch捕获多个异常
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse("2019-12-14");
        System.out.println(5 / 0);
        /*try {
            Date date = format.parse("2019-12-14");
            System.out.println(5 / 0);
        }catch (ParseException e){
            System.out.println("格式转换错误");
        }catch (ArithmeticException e){
            System.out.println("除数不能为0！");
        }

        System.out.println("====");*/

        //抛出多个异常时的简化代码

        /*try {
            Date date = format.parse("2019");
            System.out.println(5 / 0);
        }catch (Exception e){
            System.out.println("出现问题了！！");
        }*/

//        格式三
        /*try {
            Date date = format.parse("2019-12-14");
            System.out.println(5 / 0);
        }catch (ParseException|ArithmeticException e){
            System.out.println("程序出错误");
        }*/
    }

}
