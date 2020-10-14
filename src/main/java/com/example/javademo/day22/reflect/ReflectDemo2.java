package com.example.javademo.day22.reflect;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        //通过反射设置属性值
//        Class<D> clz = D.class;
//        //获取f2属性
//        Field field = clz.getField("f2");
//        //创建一个D的对象
//        D d = clz.newInstance();
//        //设置值
//        field.set(d,10);
//        System.out.println(d.f2);

        //给f1设置值
//        Class<D> clz = D.class;
//        Field field = clz.getDeclaredField("f1");
//        D d = clz.newInstance();
//        //暴力破解
//        field.setAccessible(true);
//        field.set(d,"aaa");
//        System.out.println(field.get(d));

        //获取当前类所有的属性 包含私有的等属性
        Class<D> clz = D.class;
        Field[] fs = clz.getDeclaredFields();
        for(Field f : fs){
            System.out.println(f);
        }
    }
}
class D{
    private String f1;
    public int f2;
    public char f3;

    public D(){

    }
}
