package com.example.javademo.day17.fx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 此案例用于泛型的引出
 */
public class FXDemo {
    public static void main(String[] args) {
        //创建一个List集合  姓名：String
//        List list = new ArrayList();
//        //添加元素 如果不指定泛型，集合中可以存储任意类型的数据
//        list.add("abc");
//        list.add("jkj");
//        list.add(100);
//        list.add(true);
////        //重写了toString
////        System.out.println(list);
//        //遍历集合
//        Iterator i = list.iterator();
//        while(i.hasNext()){
//            Object o = i.next();
//            //集合中有各种数据类型的数据 强制转换时会抛出ClassCastException
//            String s = (String) o;
//            System.out.println(s);
//        }

        //通过泛型限制集合元素的数据类型
        List<String> list1 = new ArrayList<String>();
        //添加元素
        list1.add("张无忌");
        list1.add("赵敏");
//        list1.add(100);
        //遍历集合 迭代器上可以加上泛型的具体类型
        Iterator<String> iterator = list1.iterator();
        while(iterator.hasNext()){
//            Object o = iterator.next();
//            String s = (String)o;
            //当迭代器指定了泛型的数据类型时，就无需强制转换
            String s = iterator.next();
            System.out.println(s);
        }

    }
}

