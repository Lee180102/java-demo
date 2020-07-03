package com.example.javademo.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo1 {
    public static void main(String[] args) throws Exception{
        //String 解析成Date对象
        String str = "20191217";
        //格式必须和字符串格式对应
        DateFormat format = new SimpleDateFormat("yyyyMMdd");//默认：-- 上午 10:43
        //String Date parse
        Date date = format.parse(str);
        System.out.println(date);
    }
}
