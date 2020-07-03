package com.example.javademo.throwable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo9 {
    public static void main(String[] args) {
        /*DateFormat format= new SimpleDateFormat("yyyy/MM/dd");
        Date date;
        try {
            date = format.parse("20191214");
        }catch (ParseException e){
            e.printStackTrace();
        }finally{
            date = null;
            System.out.println("hello");
        }*/

//        System.out.println(date);

    }

    public static int method(){
        int i = 10;
        try{
            i = 20;
//            return i;
            System.out.println(5/0);
        }catch (Exception e){
            i = 30;
            return i;
        }finally {
            i = 40;
            return i;
        }
//      return i;
    }
}
