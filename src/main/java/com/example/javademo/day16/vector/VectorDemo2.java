package com.example.javademo.day16.vector;

import java.util.Vector;

public class VectorDemo2 {
    public static void main(String[] args) {
        Vector<Student> v = new Vector<Student>();

        v.addElement(new Student("zhangsan",18));
        v.addElement(new Student("lisi",28));

        System.out.println(v);
        //补齐其他遍历方式的代码
    }
}
class Student{
    private String name;
    private int age;

    public Student(){}
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
