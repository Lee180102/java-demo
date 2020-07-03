package com.example.javademo.date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //Date
        Date date = new Date();//包装的是当前的时间
        System.out.println(date);//Tue Dec 17 10:07:31 CST 2019
        //重写了toString方法
        //获取毫秒值
        System.out.println(date.getTime());

        //通过有参构造创建指定时间的Date对象
        Date date1 = new Date(1123123);
        System.out.println(date1);

        Date date2 = new Date();
        System.out.println(date2);
        date2.setTime(10000);//1秒=1000毫秒
        System.out.println(date2);

        //2000-12-13
        //2000/12/13
        //2000年12月13日
        //20001213

    }
}
