package com.example.javademo.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CellectionDemo5 {
    public static void main(String[] args) {
        //遍历集合
        //思路一：将集合转为数组，以遍历数组的方式来遍历集合
            //1 先创建集合对象
        /*Collection c = new ArrayList();
            //2 添加元素到集合中
        c.add("武松");
        c.add("武大郎");
        c.add("鲁智深");
            //3 将集合转为数组
        Object[] arrs = c.toArray();
            //4 遍历数组 打印元素内容
        for (int i = 0; i <arrs.length ; i++) {
//            Object o = arrs[i];
//            System.out.println(o);
            String name = (String)arrs[i];
            System.out.println(name);
        }*/

        //思路二：增强for循环
        Collection c = new ArrayList();
        //2 添加元素到集合中
        c.add("武松");
        c.add("武大郎");
        c.add("鲁智深");

        //增强for循环遍历集合
        for(Object o:c){
            System.out.println(o);
        }
    }
}
