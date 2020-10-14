package com.example.javademo.day22.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflecDemo3 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //获取F类中m1无参方法
        Class<F> clz = F.class;
        //获取F的对象
        F f = clz.newInstance();
        //获取m1方法
//        Method m1 = clz.getMethod("m1");
//        //调用方法 需要指定调用的对象 和参数值
//        m1.invoke(f);

        //获取带参数的m1方法
//        Method m11 = clz.getMethod("m1",int.class);
//        m11.invoke(f,100);
        //获取私有的无参m2方法
//        Method m2 = clz.getDeclaredMethod("m2");
//        //暴力破解
//        m2.setAccessible(true);
//        m2.invoke(f);

        //获取带返回值类型的m3方法
//       Method m3 =  clz.getDeclaredMethod("m3");
//       m3.setAccessible(true);
//       Object o = m3.invoke(f);
//        System.out.println(o);
        //获取方法返回值类型的Class对象
//        Class c = m3.getReturnType();
//        System.out.println(c);
        clz.getMethod("m1",int[].class);
        clz.getMethod("m1",new int[0].getClass());
    }
}
class F{
    public void m1(){
        System.out.println("m1");
    }
    public void m1(int i){
        System.out.println("m1"+i);
    }
    public void m1(int[] arr){
        System.out.println("m1"+arr);
    }
    private void m2(){
        System.out.println("私有的无参方法");
    }
    private int m3(){
        System.out.println("私有的无参方法");
        return 10;
    }
}
