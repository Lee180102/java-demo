package com.example.javademo.day18.file;

import java.io.File;
import java.io.IOException;

public class FilePathDemo {
    public static void main(String[] args) throws IOException {
        //指定. 代表当前目录
//        File file = new File(".");
//        输出当前目录的绝对路径
//        String path = file.getAbsolutePath();
//        System.out.println(path);
        //测试通过相对路径创建文件
//        File file = new File("a.txt");
//        System.out.println(file.createNewFile());

        //相对路径
//        File file = new File(".\\day18\\src\\b.txt");
        //绝对路径方式：E:\Users\TEDU\IdeaProjects\Javase\day18\src\b.txt
//        System.out.println(file.createNewFile());

        //判断file 路径是否是绝对路径
        File file = new File(".\\day18\\src\\b.txt");
        System.out.println(file.isAbsolute());
    }
}
