package com.example.javademo.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        /*//1、集合转数组
        List<Integer> ages = new ArrayList<Integer>();
        ages.add(0,18);
        ages.add(1,20);
        ages.add(2,66);
        //集合转数组
        Object[] ages1 = ages.toArray();
        for (int i = 0; i <ages1.length ; i++) {
            System.out.println(ages1[i]);
        }*/
        //增强for循环
        /*List<Integer> ages = new ArrayList<Integer>();
        ages.add(0,18);
        ages.add(1,20);
        ages.add(2,66);
        for (Object o:ages) {
            System.out.println(o);
        }*/

        //普通for循环
        /*List<Integer> ages = new ArrayList<Integer>();
        ages.add(0,18);
        ages.add(1,20);
        ages.add(2,66);
        for (int i = 0; i < ages.size(); i++) {
            System.out.println(ages.get(i));
        }*/
    }
}
