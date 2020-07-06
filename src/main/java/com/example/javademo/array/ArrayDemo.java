package com.example.javademo.array;

public class ArrayDemo {
    public static void main(String[] args) {
        //创建int数组
        int[] ages = new int[5];
        System.out.println(ages[0]);
        //创建String类型的数组
        String[] names = new String[5];
        System.out.println(names[0]);//null 引用数据类型默认值为null

        //创建5个学生对象
        Student s1 = new Student("zhangsan",18,'男');
        Student s2 = new Student("lisi",20,'男');
        Student s3 = new Student("wangwu",28,'女');
        Student s4 = new Student("zhaoliu",78,'男');
        Student s5 = new Student("caoyang",66,'男');

        //数组存储5个学生的信息
        Student[] stus = new Student[5];//1911班级

        //将学生对象存入数组中
        stus[0] = s1;
        stus[1] = s2;
        stus[2] = s3;
        stus[3] = s4;
        stus[4] = s5;

//        for (int i = 0; i <stus.length ; i++) {
//            stus[i] = "s"+i;//s0 字符串
//        }
        //遍历数组输出所有学生的详细信息
        for (int i = 0; i <stus.length ; i++) {
//            System.out.println(stus[i].getName()+"-"+stus[i].getAge()+"-"+stus[i].getGender());
            System.out.println(stus[i]);
        }

//        stus[4] = null;
        stus[5] = new Student();//数组长度已经固定

        Student[] stus1 = new Student[10];


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