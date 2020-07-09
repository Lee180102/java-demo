package com.example.javademo.day19.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        BufferedInputStream bin = new BufferedInputStream(
                new FileInputStream("e:\\aa\\file.txt"));
        //读取文件内容
        int i;
        while((i=bin.read())!=-1){
            System.out.println((char)i);
        }
    }
}
