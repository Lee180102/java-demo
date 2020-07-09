package com.example.javademo.day19.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        //BufferedReader
        FileReader r = new FileReader("e:\\aa\\file2.txt");
        BufferedReader reader = new BufferedReader(r);
        //读取数据
        String line = null;
        //遍历读取所有内容
        //readLine方法当读取完成则返回null
        while((line = reader.readLine())!=null){
            System.out.println(line);
        }
    }
}
