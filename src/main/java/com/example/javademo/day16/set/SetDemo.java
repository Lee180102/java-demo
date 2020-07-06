package com.example.javademo.day16.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //创建Set集合的对象
        Set<String> set = new HashSet<String>();
//        添加元素
        set.add("abc");
        set.add("aed");
        set.add("dfs");
        set.add("ert");
        set.add(null);
        set.add(null);

        System.out.println(set);
//        set.add("abc");//不会报错 但是检测到已经有相同元素存在了，所以不再添加
//        set.add(new String("abc"));
//        set.add(new String("abc"));//比较内容是否相同

//        System.out.println(set);
//        Set<Student> s = new HashSet<Student>();
//        s.add(new Student("zhangsan",18));
//        s.add(new Student("zhangsan",19));
//        System.out.println(s);
    }
}

class Student{
    private String name;
    private int age;
    public Student(){

    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
