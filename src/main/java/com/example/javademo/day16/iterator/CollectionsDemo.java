package com.example.javademo.day16.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(5);
        list.add(22);
        list.add(32);
        list.add(11);

        //输出集合中的最大值
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.reverse(list);
//        Collections.sort(list);//自然排序
        System.out.println(list);

    }
}
