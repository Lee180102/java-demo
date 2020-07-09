package com.example.javademo.day18.file;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        File file = new File("E:\\");
        //列出当前目录下所有子文件和子目录的名称
//        String[] files = file.list();
//        for (String s : files) {
//            System.out.println(s);
//        }

        //listFiles
        File[] files = file.listFiles();
        for (File f : files) {
            //判断是目录
            if(f.isDirectory()){
                System.out.println("目录："+f);
            }
            //判断是文件
            if(f.isFile()){
                System.out.println("文件："+f);
            }
//            System.out.println(f);
        }
    }
}
