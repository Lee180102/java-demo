package com.example.javademo.day22.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        //
        Properties properties = new Properties();
        //2、将文件中的内容读取到properties
        FileInputStream in = new FileInputStream("D:/pro.txt");
        //3、调用加载方法
        properties.load(in);
        //关流
        in.close();
        //输出properties中的数据
        System.out.println(properties);
    }
}
