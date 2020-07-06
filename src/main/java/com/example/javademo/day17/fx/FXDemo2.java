package com.example.javademo.day17.fx;

/**
 * 此案例用于演示接口上定义泛型
 *  和类上定义泛型基本类似
 */
public class FXDemo2 {
    public static void main(String[] args) {
//        new InterImpl().meth("abc");
//        new InterImpl<String>();
    }
}
interface Inter<T>{
    public void meth(T num);
}
/*class InterImpl implements Inter<String>{


    @Override
    public void meth(String num) {
        System.out.println(num);
    }
}*/
class InterImpl<T> implements Inter<T>{

    @Override
    public void meth(T num) {
        System.out.println(num);
    }
}