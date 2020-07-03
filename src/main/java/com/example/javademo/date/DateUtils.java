package com.example.javademo.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1、格式化 Date-》String
 * 2、解析  String-》Date
 *
 *工具类：
 *  1、私有化构造方法
 *  2、提供静态的方法
 */
public class DateUtils {
    //私有化构造方法
    private DateUtils(){}

    //格式化
    //date 代表要格式化的Date对象
    //format 代表格式化的具体格式内容
    public static String dateToString(Date date,String format){
        return new SimpleDateFormat(format).format(date);//链式编程
    }
    //解析
    //dateStr 代表的是日期字符串
    //format 代表格式化的具体格式内容
    public static Date stringToDate(String dateStr,String format) throws Exception{
        return new SimpleDateFormat(format).parse(dateStr);
    }
}
