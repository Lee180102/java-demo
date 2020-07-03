package com.example.javademo.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
    public static void main(String[] args) {
        //Date对象
        Date date = new Date();//默认指得是当前时间
        //创建SimpleDateFormat
        DateFormat format = new SimpleDateFormat();//向上造型
        //格式化 Date——》String
        String str = format.format(date);
        System.out.println(str);

        //指定格式yyyy-MM-dd
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String str2 = format1.format(date);
        System.out.println(str2);
        ////2000/12/13
        DateFormat format2 = new SimpleDateFormat("yyyy/MM/dd");
        String str3 = format2.format(date);
        System.out.println(str3);
        //2000年12月13日
        DateFormat format3 = new SimpleDateFormat("yyyy年MM月dd日");
        String str4 = format3.format(date);
        System.out.println(str4);
        //08:15
        DateFormat format4 = new SimpleDateFormat("HH:mm");
        String str5 = format4.format(date);
        System.out.println(str5);
    }
}
