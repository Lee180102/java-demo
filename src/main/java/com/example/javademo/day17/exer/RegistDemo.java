package com.example.javademo.day17.exer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistDemo {
    public static void main(String[] args) {
        //构建一个map 代表已注册的用户的信息
        Map<String,User> users = new HashMap<String,User>();
        users.put("001",new User("曹洋洋",28,
                "18811118888","666666"));
        users.put("002",new User("喜洋洋",8,
                "18822227777","666666"));
        users.put("003",new User("美洋洋",3,
                "18833336666","666666"));

//        System.out.println(users);

        //获取用户输入的信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入手机号码：");
        String phoneNum = sc.next();
        System.out.println("请输入密码：");
        String passWord = sc.next();
//        System.out.println(username+","+age+","+phoneNum+","+passWord);
        //将获取到的信息封装到User对象中
        User user = new User(username,age,phoneNum,passWord);

        boolean flag = true;//可以注册

        //查询users里边有没有和当前用户手机号一样的用户
        for (Map.Entry<String,User> user1 : users.entrySet()) {
            String num = user1.getValue().getPhoneNum();
            //判断手机号是否相同
            if(num == phoneNum || num.equals(phoneNum) ){
                flag = false;
                System.out.println("手机号已经被注册，请确认您的信息！");
                break;
            }
        }
        if(flag){
            //可以注册，将当前用户信息存入map中
            users.put("004",user);
            System.out.println("您已注册成功！");
        }

    }
}
