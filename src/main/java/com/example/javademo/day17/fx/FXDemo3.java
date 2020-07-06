package com.example.javademo.day17.fx;

/**
 * 此案例用于方法上定义泛型
 */
public class FXDemo3 {
    public static void main(String[] args) {
        Demo d = new Demo();
        String s = d.method("abc");
        System.out.println(s);

        String s1 = d.method1("abc",100);
        System.out.println(s1);

        Student student = new Student();
        Student student1 = d.method(student);
    }
}
class Demo{
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    public <T> T method(T t){
        return t;
    }
    //方法上可以定义多个泛型
    public <T1,T2> T1 method1(T1 t1,T2 t2){
        return t1;
    }
}
class Demo1<T1,T2>{
    private T1 t1;
    private T2 t2;
}
class Student{}