package com.example.javademo.calendar;

public abstract class Demo {
    public Demo(){}

    public static Demo getInstance(){
        return new Demo1();
    }
}
class Demo1 extends Demo{

}
