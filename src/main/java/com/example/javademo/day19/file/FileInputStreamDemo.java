package com.example.javademo.day19.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("D:/Temps/aa/file.txt");
//        int i = in.read();
        //ASCII编码 1-9 a-z A-Z  一个字符占用一个字节
        //GBK 一个字符占用两个字节 GBK兼容ASCII编码
        //UTF-8  GBK兼容ASCII编码
//        System.out.println((char)i);

        //数组
//        byte[] bytes = new byte[6];
//        int num = in.read(bytes);
//        System.out.println(new String(bytes));

        //通过遍历获取文件中所有数据
        byte[] bytes = new byte[6];
        int num;
        StringBuilder builder = new StringBuilder();
        while((num=in.read(bytes))!= -1){
            builder.append(new String(bytes,0,num));
        }
        System.out.println(builder);
        in.close();
    }
}
