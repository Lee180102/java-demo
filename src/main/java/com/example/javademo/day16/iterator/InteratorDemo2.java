package com.example.javademo.day16.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorDemo2 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("lisi",34));
        list.add(new Person("zhangsan",55));
        list.add(new Person("wangwu",34));
        //迭代器遍历
        /*Iterator<Person> it = list.iterator();

        while(it.hasNext()){
            Person p = it.next();
            //注意next方法每调用一次就会移动指针，获取一个元素
//            System.out.println(it.next().getAge()+","+it.next().getName());//34,zhangsan
        }*/
        for(Person p : list){
//            System.out.println(p.getName());
            list.remove(p);
        }
    }
}
class Person{
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

   /* @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/
}
