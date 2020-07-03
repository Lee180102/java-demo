package com.example.javademo.calendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 		获取用户输入的年份，输出该年2月份的天数
 * 			思路：
 * 				如何使用Calendar来方便的解决这个问题呢？
 * 				如果当前日期是3月1号，则往前一天一定是2月份的最后一天
 * 				则输出2月份最后一天对应的天数就是2月份的天数
 * 			1、获取用户输入的年份 Scanner
 * 			2、获取Calendar对象，默认是当前时间
 * 			3、设置Calendar的时间，年份year 月份3 日期1
 * 			4、调用add方法 往前一天 也是2月份的最后一天
 *          5、输出当前Calendar对象的天数
 */
public class CalendarDemo2 {
    public static void main(String[] args) {
        //获取用户输入的年份 Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查询的年份：");
        int year = sc.nextInt();

        //获取Calendar对象，默认是当前时间
        Calendar calendar = Calendar.getInstance();

        /*//设置Calendar的时间，年份year 月份3 日期1
        calendar.set(Calendar.YEAR,year);
        //1-12  0-11
        calendar.set(Calendar.MONTH,2);
        calendar.set(Calendar.DAY_OF_MONTH,1);*/
        //简化版本
        calendar.set(year,2,1);

        //4、调用add方法 往前一天 也是2月份的最后一天
        calendar.add(Calendar.DAY_OF_MONTH,-1);

        //输出当前Calendar对象的天数
        System.out.println(year+"年，2月份共"+calendar.get(Calendar.DAY_OF_MONTH)+"天");

    }
}
