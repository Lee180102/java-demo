package com.example.javademo.date;

import java.util.Date;
import java.util.Scanner;

/**
 * 计算你到这个世界多少天了？
 * 				第一个日期：出生日期 转换为毫秒值
 * 				第二个日期：今天的时间 直接获取毫秒值
 * 				第二个毫秒值-第一个毫秒值
 * 				将活的毫秒值转换为天
 *                 /1000/60/60/24 天
 */
public class DateDemo2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生年月日；例如：2019-12-13");
        //获取第一个日期：出生日期
        String dateStr = sc.next();
        //解析
        Date date = DateUtils.stringToDate(dateStr,"yyyy-MM-dd");
        //将Date转为毫秒值
        long start = date.getTime();

        //获取当前时间的毫秒值
        long now = new Date().getTime();

        //第二个毫秒值-第一个毫秒值
        long time = now - start;
        //将活的毫秒值转换为天
        long day = time/1000/60/60/24;
        System.out.println("我已经活了："+day+"天");
    }
}
