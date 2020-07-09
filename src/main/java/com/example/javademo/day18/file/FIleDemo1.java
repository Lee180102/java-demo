package com.example.javademo.day18.file;

import java.io.File;
import java.io.IOException;

public class FIleDemo1 {
    public static void main(String[] args) throws IOException {
        //创建file的对象
//        File file = new File("E:\\aa\\a.txt");
        //以下代码 路径名文件并不存在 编译运行都不会报错
//        File file = new File("E:\\aa\\b.txt");
//        File file = new File("E:\\aa");
        //输出file对象 重写了toString方法 当前file对象代表的路径名称
//        System.out.println(file);

        //创建功能
//        File file = new File("E:\\aa\\b.txt");
//        File file = new File("E:\\cc");
//        //creatNewFile
//        boolean flag = file.createNewFile();
//        System.out.println(flag);
        //File file = new File("E:\\cc");
        //mkdir
//        System.out.println(file.mkdir());
        //mkdirs
//        File file = new File("E:\\cc\\aa\\bb");
//        File file = new File("E:\\bb");
//        System.out.println(file.mkdirs());

        //删除功能
        //删除目录
//        File file = new File("E:\\bb");
        //删除文件
//        File file = new File("E:\\aa\\a.txt");
//        System.out.println(file.delete());

        //重命名
        File file = new File("E:\\a.txt");
        boolean flag = file.renameTo(new File("E:\\aa\\b.txt"));
        System.out.println(flag);
    }
}
