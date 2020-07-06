package com.example.javademo.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        //定义一个集合 存储当前班级的学员
        List<Student> stus = new ArrayList<Student>();//10
        //创建5个当前班级的学员
        Student s1 = new Student("zhangsan",18,'男');
        Student s2 = new Student("lisi",20,'男');
        Student s3 = new Student("wangwu",28,'女');
        Student s4 = new Student("zhaoliu",78,'男');
        Student s5 = new Student("caoyang",66,'男');
        stus.size();//5
        //把5个学员对象添加到集合当中
        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        stus.add(s4);
        stus.add(s5);

        //添加新的学员
//        Student s6 = new Student("aaa",27,'女');
////        stus.add(1,s6);


        //删除留级学员
//        stus.remove(1);
        //性别为女的都留级
        for (int i = 0; i <stus.size() ; i++) {
            Student s = stus.get(i);
            if(s.getGender() == '女'){
//                stus.remove(s);
                stus.remove(i);
            }
//            System.out.println(stus.get(i));
        }
        //遍历打印学员的详细信息
        for (int i = 0; i <stus.size() ; i++) {
            System.out.println(stus.get(i));
        }
    }
}
//定义学生类
class Student{
    //学生：name age gender
    private String name;
    private int age;
    private char gender;

    //提供get set方法
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Student(){}
    public Student(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
