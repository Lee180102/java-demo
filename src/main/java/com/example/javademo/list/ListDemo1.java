package com.example.javademo.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        //创建List的对象
        List<String> names =  new ArrayList<String>();
        //1、放入元素的顺序是有序的；
        names.add("zhangsan");//0
        names.add("wangwu");//1
        names.add("lisi");//2

        System.out.println(names);
        //2、允许存在重复的元素
        names.add("zhangsan");
        System.out.println(names);

        //add(int index,String str)//下标都是从0开始的
        //追加元素时，在最后的位置添加 下标时当前元素的个数值
//        names.add(3,"zhaoliu");
        //java.lang.IndexOutOfBoundsException
//        names.add(5,"123");//运行会报错
//        System.out.println(names);
        //如果添加时 下标元素已经存在，则把该位置以及之后的元素都向后挪一位；当前位置存储
        //新添加的元素
//        names.add(1,"zhaoliu");
//        System.out.println(names);
//        List<String> names1 =  new ArrayList<String>();
//        //1、放入元素的顺序是有序的；
//        names1.add("hello");//0
//        names1.add("hi");//1

//        names.addAll(3,names1);
//        names.addAll(0,names1);
//        System.out.println(names);

        //get方法
//        System.out.println(names.get(0));
//        System.out.println(names.get(1));
//        System.out.println(names.get(2));
//        //如果下标超过了元素的个数 则抛出异常java.lang.IndexOutOfBoundsException
//        System.out.println(names.get(3));

        //remove
//        names.remove(1);
//        names.remove(5);
//        System.out.println(names);

        //set 修改指定下标元素的值
//        names.set(0,"zhangsi");
//        System.out.println(names);

        List<String> list = names.subList(1,3);
        System.out.println(list);
    }
}
