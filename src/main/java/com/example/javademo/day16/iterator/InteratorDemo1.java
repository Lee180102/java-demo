package com.example.javademo.day16.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorDemo1 {
    public static void main(String[] args) {
        //ArrayList
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("java");
        list.add("bigdata");
        //获取Iterator对象
        Iterator<String> it = list.iterator();

//        while(it.hasNext()){
//            System.out.println(it.next());//hello bigdata
//            System.out.println(it.next());//java
//        }

        while(it.hasNext()){
//            System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
//            list.remove(s);
            it.remove();
        }
        System.out.println(list);

        //next
//        System.out.println(it.next());
    }
}
