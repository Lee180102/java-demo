package com.example.javademo.day22.reflect.exer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class PetDemo {
    public static void main(String[] args) throws Exception {
        //读取Properties
        Properties properties = new Properties();
        //加载文件pet.properties文件的内容到properties中
        properties.load(new FileInputStream("pet.properties"));
        //获取Properties中pet key对应的值
        String value = properties.getProperty("pet");
        //根据配置文件中类的全路径名称 可以创建该类的Class对象
        Class clz = Class.forName(value);
        //创建对象
        Object d = clz.newInstance();

        //获取配置文件中属性的值
        String name = properties.getProperty("name");
        String age = properties.getProperty("age");
        String gender = properties.getProperty("gender");

        //1、通过反射获取属性 暴力破解 赋值
        //获取name属性
        Field name1 = clz.getDeclaredField("name");
        //暴力破解
        name1.setAccessible(true);
        name1.set(d,name);
        //获取age属性
        Field age1 = clz.getDeclaredField("age");
        //暴力破解
        age1.setAccessible(true);
        age1.set(d,Integer.parseInt(age));
        //获取gender属性
        Field gender1 = clz.getDeclaredField("gender");
        //暴力破解
        gender1.setAccessible(true);
        gender1.set(d,gender.charAt(0));

        //调用方法 method
        String method = properties.getProperty("method");
        //通过反射调用方法
        Method m = clz.getMethod(method);
        m.invoke(d);

        System.out.println(d);
    }
}
