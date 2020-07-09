package com.example.javademo.day19.buffered;

import java.io.*;

public class BOSDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        BufferedOutputStream bout = new BufferedOutputStream(
                new FileOutputStream("e:\\aa\\file2.txt"));
        //将数据写出到文件
        bout.write("abcdefksljfklj".getBytes());
        //因为底层设置了缓冲区 所以需要flush将缓冲区的数据刷新到文件中
        bout.flush();
        //关流
        bout.close();
    }
}
