package com.example.javademo.date;

import java.util.Date;

public class DateUtilsTest {
    public static void main(String[] args) throws Exception{
        //测试DateUtils 工具类
        //格式化
        //new Date() 创建了Date的匿名对象
        String str = DateUtils.dateToString(new Date(),"yyyy-MM-dd");
        System.out.println(str);
        String str1 = DateUtils.dateToString(new Date(),"yyyy年MM月dd");
        System.out.println(str1);
        //解析
        Date date = DateUtils.stringToDate("2019-12-16","yyyy-MM-dd");
        System.out.println(date);

    }
}
