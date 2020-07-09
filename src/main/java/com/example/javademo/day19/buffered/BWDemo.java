package com.example.javademo.day19.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BWDemo {
    public static void main(String[] args) throws IOException {
        //创建缓冲输出流的对象
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("e:\\aa\\file3.txt"));

        //写出数据到文件
        writer.write("jlkjkljklj");
        //换行
        writer.newLine();
        writer.write("abcddd");
        //刷新
        writer.flush();
        //关闭流
        writer.close();
    }
}
