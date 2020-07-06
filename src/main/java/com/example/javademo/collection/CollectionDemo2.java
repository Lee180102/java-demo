package com.example.javademo.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();//向上造型
        //add方法添加元素
        c.add("123");
        c.add(1);
        c.add('a');
        System.out.println(c);
        //remove 移除
//        c.remove(123);//如果集合中没有当前元素 则返回false 不会报错
//        c.remove("123");
//        System.out.println(c);

        //removeAll
        Collection c1 = new ArrayList();//向上造型
        c1.add("123");
        c1.add(1);
        c1.add("hello");
        c.removeAll(c1);
        System.out.println(c);
        System.out.println(c1);
    }
}
