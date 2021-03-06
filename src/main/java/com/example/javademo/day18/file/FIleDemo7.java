package com.example.javademo.day18.file;

import java.io.File;

/**
 *
 */
public class FIleDemo7 {
    //表示java文件的个数
    private static int javaNum;
    //表示class文件的个数
    private static int classNum;
    public static void main(String[] args) {
        //统计从使用idea开始到现在我们项目中有多少个java文件，有多少个class文件
        File file = new File("E:\\Users\\TEDU\\IdeaProjects\\Javase");
        count(file);
        System.out.println("Java文件的个数为："+javaNum);
        System.out.println("class文件的个数为："+classNum);
    }
    public static void count(File file){
        if(file == null){
            throw new NullPointerException("亲，文件不能为空~~");
        }
        //如果当前file为目录
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File f : files){
                count(f);
            }
        }
        if(file.isFile()){
            //获取文件名称
            String fileName = file.getName();
            if(fileName.endsWith(".java")){
                //说明当前文件是java文件
                javaNum++;
            }else if(fileName.endsWith(".class")){
                //说明当前文件是class文件
                classNum++;
            }
        }
    }
}