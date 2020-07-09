package com.example.javademo.day18.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 此类是统计java文件个数 过滤器实现
 */
public class FIleDemo8 {
    //表示java文件的个数
    private static int javaNum;
    //表示class文件的个数
    private static int classNum;
    public static void main(String[] args) {
        //统计从使用idea开始到现在我们项目中有多少个java文件，有多少个class文件
        File file = new File("E:\\Users\\TEDU\\IdeaProjects\\Javase");
        count(file);
        System.out.println("Java文件的个数为："+javaNum);
//        System.out.println("class文件的个数为："+classNum);
    }
    //计算递归方法
    public static void count(File file){
        if(file == null){
            throw new NullPointerException("亲，文件不能为空~~");
        }
        //如果当前file为目录
        if(file.isDirectory()){
            File[] files = file.listFiles();
            String[] javas = file.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".java");
                }
            });
            javaNum += javas.length;
            for(File f : files){
                count(f);
            }
        }
        /*if(file.isFile()){
            //获取文件名称
            String fileName = file.getName();
            if(fileName.endsWith(".java")){
                //说明当前文件是java文件
                javaNum++;
            }else if(fileName.endsWith(".class")){
                //说明当前文件是class文件
                classNum++;
            }
        }*/
    }
}
