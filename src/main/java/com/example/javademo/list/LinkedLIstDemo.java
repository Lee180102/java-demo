package com.example.javademo.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedLIstDemo {
    public static void main(String[] args) {
        //LinkedList
//        List<String> list = new LinkedList<String>();
        LinkedList<String> list = new LinkedList<String>();


        list.addFirst("hello");
        list.add("aaa");
        list.add("bbb");
        //基于当前的内容 添加到最后
        list.addLast("ddd");
        list.add("ccc");
        System.out.println(list);

        list.addFirst("eee");
        System.out.println(list);

        String str = list.element();
        System.out.println(str);
        System.out.println(list);

        String str1 = list.getFirst();
        System.out.println(str1);
        System.out.println(list);

        String str2 = list.getLast();
        System.out.println(str2);
    }
}
