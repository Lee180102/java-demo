package com.example.javademo.day19.xuliehua;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private transient double gender;
    private static int eyeNum = 2;

    public static int getEyeNum() {
        return eyeNum;
    }

    public Person(){}
    public Person(String name,int age){
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

    /*public double getGender() {
        return gender;
    }

    public void setGender(double gender) {
        this.gender = gender;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
