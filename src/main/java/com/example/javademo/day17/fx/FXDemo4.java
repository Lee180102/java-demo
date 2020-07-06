package com.example.javademo.day17.fx;

/**
 * 泛型通配
 */
public class FXDemo4 {
    public static void main(String[] args) {
        method(new Demo2<String>());
        method(new Demo2<Integer>());
    }
    public static void method(Demo2<?> d){
//        d.setField("100");
////        d.setField
////        System.out.println(100);
////        d.setField("123");
        System.out.println(d.getField());
    }

//    public static void method(Demo2<String> d){
////        d.setField("abc");
////        d.setField(100);
//        d.setField("100");
//        System.out.println(d.getField());
//    }
}
class Demo2<T>{
    private T field;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
