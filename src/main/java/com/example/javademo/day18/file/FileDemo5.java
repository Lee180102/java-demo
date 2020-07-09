package com.example.javademo.day18.file;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        //如果目录不为空 则不能直接删除
//        boolean flag = file.delete();
//        System.out.println(flag);
        File file = new File("E:\\a.txt");
        removeAll(file);
    }
    //  cc/aa/a.txt
    public static void removeAll(File file){//cc/aa a.txt
        if(file==null){
            throw new NullPointerException("亲，文件不能为空啊~~");
        }
        //判断当前file是否为目录
        if(file.isDirectory()){
            //遍历当前目录下的所有子文件和子目录
            File[] files = file.listFiles();//aa  a.txt
            for(File f : files){
                //将每个文件或目录作为参数传给removeAll方法
                removeAll(f);
            }
        }
        //不管是目录还是文件 只要能删除就干掉
        file.delete();
    }
}
