package com.example.javademo.day16.vector;

import java.util.Vector;

public class VectorDemo1 {
    public static void main(String[] args) {
        //创建Vector对象
        Vector<Integer> v = new Vector<Integer>();//10

        //addElement
        v.addElement(18);
        v.addElement(24);
        v.addElement(32);
        System.out.println(v.capacity());
        for (int i = 10; i <= 30; i++) {
            v.addElement(i);
        }
        //重写了toString方法
        System.out.println(v);
        System.out.println(v.capacity());
//
//        System.out.println(v.elementAt(0));

//        Vector<Integer> v = new Vector<Integer>(10,5);
//        for (int i = 10; i <= 20; i++) {
//            v.addElement(i);
//        }
//        System.out.println(v.capacity());
    }
}
