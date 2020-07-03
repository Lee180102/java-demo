package com.example.javademo.quartz.config;

import java.util.Calendar;

public class CalendarTest {

    static Calendar calendar = Calendar.getInstance();


    public static void main(String[] args) {
        year();
    }

   static void year (){
       int year = calendar.get(Calendar.YEAR);
       System.out.println(year);
    }

    static void firstDay(){


    }
}
