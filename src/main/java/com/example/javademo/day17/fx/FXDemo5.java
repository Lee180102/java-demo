package com.example.javademo.day17.fx;

/**
 * 泛型上限
 * 泛型下限
 */
public class FXDemo5 {
    public static void main(String[] args) {
//        method(new Demo5<Number>());
//        method(new Demo5<Integer>());
//        method(new Demo5<String>());
//        method(new Demo5<String>());
        //Number是Integer的父类
        method(new Demo5<Integer>());
        method(new Demo5<Number>());
    }
    //泛型上限的案例
    /*public static void method(Demo5<? extends Number> d){
//        d.setField(100);
        System.out.println(d.getField());
    }*/
    public static void method(Demo5<? super Integer> d){
//        d.setField(100);
        System.out.println(d.getField());
    }
}

class Demo5<T>{
    private T field;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
