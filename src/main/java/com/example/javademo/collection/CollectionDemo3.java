package com.example.javademo.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();//向上造型
        //add方法添加元素
        c.add("123");
        c.add(1);
        c.add('a');
        System.out.println(c);

        Collection c1 = new ArrayList();//向上造型
        c1.add("123");
        c1.add(1);
        c1.add("hello");

        //可以保留c和c1中共有的元素
        c.retainAll(c1);
        System.out.println(c);
        System.out.println(c1);

        //乒乓球 台球 唱歌
        //谁既报了乒乓球比赛，还报了台球比赛


    }
}
