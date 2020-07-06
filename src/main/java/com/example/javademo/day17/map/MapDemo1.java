package com.example.javademo.day17.map;

import java.util.ArrayList;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {
        //添加学号-》String
        List<String> snos = new ArrayList<String>();
        //添加学生
        List<Student> stus = new ArrayList<Student>();
        //学号和学生对应关系

        //第一个学生
        snos.add("001");
        stus.add(new Student("张三",18));

        //第二个学生
        snos.add("002");
        stus.add(new Student("李四",19));

        //遍历
        /*for (int i = 0; i <snos.size() ; i++) {
            String sno = snos.get(i);
            Student stu = stus.get(i);
            System.out.println(sno+","+stu.getName()+","+stu.getAge());
        }*/

        System.out.println(snos.get(0));
        System.out.println(stus.get(1));

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
