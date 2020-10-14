package com.example.javademo.day22.properties.exer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class UserDemo {
    public static void main(String[] args) throws Exception {
        regist();
//        change();
    }
    //此方法用户获取用户信息 并存储到user.txt中
    public static void regist() throws IOException {
        //Scanner
        Scanner sc = new Scanner(System.in);
        //准备一个Properties 用来存储用户的信息
        Properties properties = new Properties();
        while(true){
            System.out.println("请输入姓名：(退出请输入end:)");
            String name = sc.next();
            if ("end".equals(name)){
                break;
            }
            System.out.println("请输入性别：");
            String gender = sc.next();

            properties.setProperty(name,gender);
        }
        properties.store(new FileOutputStream("D:/user.properties"),"此文件保存了用户的信息");
    }
    //修改用户性别
    public static void change() throws Exception {
        //将用户的信息读入
        Properties properties = new Properties();
        //调用加载的方法
        properties.load(new FileInputStream("user.properties"));
        //key "英子"
        properties.setProperty("英子","boy");
//        System.out.println(properties);
        //将修改后的数据重新写回到user.txt
        properties.store(new FileOutputStream("user.properties"),null);
    }
}
