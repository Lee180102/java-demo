package com.example.javademo.day18.file;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File file = new File("E:\\aa");
        printFileName(file);
    }
    public static void printFileName(File file){
        //如果file为空 则不再运行
        if(file==null){
            throw new NullPointerException("亲，文件不能为空啊~~");
        }
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File f:files) {
                printFileName(f);
            }
        }
        if(file.isFile()){
            System.out.println(file.getName());
        }
        /*File[] files = file.listFiles();
        if(files !=null){
            for (File f:files) {
                //如果是文件 则直接输出文件名
                if(f.isFile()){
                    System.out.println(f.getName());
                }
                //如果是目录 则递归调用该方法
                if(f.isDirectory()){
                    printFileName(f);
                }
            }
        }*/

    }
}
