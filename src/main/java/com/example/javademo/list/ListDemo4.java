package com.example.javademo.list;

import java.util.ArrayList;

public class ListDemo4 {
    public static void main(String[] args) {
//        int num = 10;
//        System.out.println(num >> 1);
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add(1,"world");

        list.remove(0);
        System.out.println(list);
    }
}
