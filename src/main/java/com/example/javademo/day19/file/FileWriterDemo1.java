package com.example.javademo.day19.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        //创建FileWriter对象
//        FileWriter writer = new FileWriter("D:/Temps/aa/file.txt");
          FileWriter writer = new FileWriter("D:/Temps/aa/file.txt",true);
        //write方法写出单个数据
        for (int i = 65; i < 91; i++) {
            writer.write((char)i);
        }

        //flush 刷新数据
        writer.flush();

        //写出字符串
//        writer.write("abcdjkfdjklfjjk");
//        writer.flush();
//
//        //关闭流
//        writer.close();
//        System.out.println(writer);

        //10000
        writer = null;
    }
}
