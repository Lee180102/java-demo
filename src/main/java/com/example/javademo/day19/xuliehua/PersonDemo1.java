package com.example.javademo.day19.xuliehua;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonDemo1 {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.setName("张三");
        person.setAge(30);
//        person.setGender(3.14);

//        System.out.println(Person.getEyeNum());
        Person person1 = new Person("李四",24);

        //将当前person对象进行序列化
        //指定序列化之后将内容存储在文件中
        FileOutputStream fos = new FileOutputStream("e:\\aa\\person4.txt");
        //创建序列化流对象
        ObjectOutputStream out = new ObjectOutputStream(fos);

        //调用方法序列化指定的对象
        out.writeObject(person);
        out.writeObject(person1);

        //关闭流
        out.close();



    }
}
