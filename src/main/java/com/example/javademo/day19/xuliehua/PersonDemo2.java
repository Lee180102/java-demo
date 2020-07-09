package com.example.javademo.day19.xuliehua;

import java.io.*;

public class PersonDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //反序列化
        //指定反序列化的文件
        File file = new File("e:\\aa\\person4.txt");
        //输入流来读取文件内容
        FileInputStream in = new FileInputStream(file);
        //创建反序列化流
        ObjectInputStream ois = new ObjectInputStream(in);

        //调用反序列化方法 来创建对象
        Object o = ois.readObject();
        //强制转换为Person类型
        Person p = (Person)o;
        System.out.println(p.getName()+":"+p.getAge()+":"
                +Person.getEyeNum()/*+p.getGender()*/);
        Object o1 = ois.readObject();
        //强制转换为Person类型
        Person p1 = (Person)o1;
        System.out.println(p1.getName()+":"+p1.getAge()+":"
                +Person.getEyeNum()/*+p.getGender()*/);

        ois.close();

    }
}
