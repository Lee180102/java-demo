package com.example.javademo.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar calendar = Calendar.getInstance();
//        System.out.println(Calendar.YEAR);
//        System.out.println(Calendar.MONTH);
//        System.out.println(calendar.get(Calendar.YEAR));//2019
//        System.out.println(calendar.get(Calendar.MONTH)+1);

        /*Date date = calendar.getTime();
        System.out.println(date);*/

        //add
//        calendar.add(Calendar.YEAR,-1);
//        System.out.println(calendar.get(Calendar.YEAR));

        //set
        calendar.set(2020,1,14);
        System.out.println(calendar.get(Calendar.YEAR));


    }
}
