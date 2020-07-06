package com.example.javademo.day16.set;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        //treeSet中存储Person对象
//        TreeSet<Person> tree = new TreeSet<Person>();
//
//        //添加元素
//        tree.add(new Person("zhangsan",55));
//        tree.add(new Person("lisi",34));
//        tree.add(new Person("wangwu",34));
//
//        //如果自定类 存入treeSet集合，如果无法排序，则程序会抛出异常
//        System.out.println("集合内容："+tree);
    }
}
/*class Person implements Comparable{
    private String name;
    private int age;
    public Person(){}

    public Person(String name, int age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        //如果返回正整数，则当前对象大于参数对象
        Person p = (Person)o;
        //根据age比较Person的大小
        return this.age-p.age;
    }
}*/
