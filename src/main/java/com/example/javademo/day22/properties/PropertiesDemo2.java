package com.example.javademo.day22.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        //创建Properties对象
        Properties properties = new Properties();
        //添加元素 setProperty方法指定key value必须都是String类型
        properties.setProperty("001","zhangsan");
        properties.setProperty("002","lisi");
        properties.setProperty("003","wangwu");
//        properties.setProperty(10,12);
//        System.out.println(properties);
//        String value = properties.getProperty("003");
//        System.out.println(value);
        //将Properties中的键值对输出到一个文件中
        //FileOutputStream  FileWriter
        FileOutputStream out = new FileOutputStream("D:/pro.txt");
        //将Properties中的键值对数据持久化
        properties.store(out,"aaa");
        //关流
        out.close();
    }
}
