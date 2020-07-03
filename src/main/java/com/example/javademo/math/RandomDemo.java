package com.example.javademo.math;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        /*//创建Random对象 无参构造
        Random random = new Random();
        //通过random对象获取一个int类型的随机数
        int num = random.nextInt();
        System.out.println(num);*/
        //创建Random对象 参数给定long类型种子
        Random random1 = new Random(123);
        for (int i = 0; i <5 ; i++) {
            System.out.println(random1.nextInt(10));
        }
    }
}
