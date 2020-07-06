package com.example.javademo.day16.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class DieDaiQiDemo {
    public static void main(String[] args) {
        //创建Vector对象
        Vector<String> v = new Vector<String>();

        //添加元素
        v.add("hello");
        v.add("World");
        v.add("java");
        //
        Enumeration<String> e = v.elements();
        //
//        String s = e.nextElement();
//        System.out.println(s);
//        String s1 = e.nextElement();
//        System.out.println(s1);
//        String s2 = e.nextElement();
//        System.out.println(s2);
//        //java.util.NoSuchElementException
//        String s3 = e.nextElement();
//        System.out.println(s3);

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
