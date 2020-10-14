package com.example.javademo.day22.reflect.exer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
//        arr.add("abc");
        //clz代表ArrayList类的Class对象
        Class clz = arr.getClass();
        //获取add方法
        Method m = clz.getMethod("add",Object.class);
        m.invoke(arr,"abc");
        System.out.println(arr);
    }
}
