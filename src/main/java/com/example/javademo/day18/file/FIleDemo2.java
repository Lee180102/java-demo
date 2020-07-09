package com.example.javademo.day18.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FIleDemo2 {
    public static void main(String[] args) throws IOException {
//        File file = new File("E:\\aa\\b.txt");
        //判断当前文件是否可写
//        boolean flag = file.canWrite();
//        System.out.println(flag);
//        File file = new File("E:\\aa\\c.txt");
        //exists 判断当前路径指向的文件是否存在
//        System.out.println(file.exists());//true

        //判断是否是一个目录
//        File file = new File("E:\\aa\\b.txt");
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());

//        System.out.println(file.isHidden());

        //getAbsoluteFile
//        File file = new File("a.txt");
//        File file1 = file.getAbsoluteFile();
//        file1.renameTo(new File("E:\\a.txt"));
//        System.out.println(file1);

//        String path = file.getAbsolutePath();

        //getName
//        File file = new File("E:\\a.txt");
//        File file = new File("E:\\file.txt");
//        String fileName = file.getName();
//        System.out.println(fileName);
        //模拟getName方法的实现
//        String path = "E:\\file.txt";
//        int index = path.lastIndexOf('\\');
//        String fileName = path.substring(index+1);
//        System.out.println(fileName);

        //getParent
//        File file = new File("E:\\dir\\file.txt");
////        System.out.println(file.getParent());
//        File file = new File("day18\\a.txt");
//        System.out.println(file.getParent());
        //getParentFile
//        File file = new File("a.txt");
//        File f = file.getParentFile();
//        System.out.println(f);

        //getPath
//        File file = new File("E:\\dir\\file.txt");
//        String filePath = file.getPath();
//        System.out.println(filePath);

        //length
//        File file = new File("E:\\aa\\b.txt");
//        //以字节计数 中文在GKB编码中占两个字节
//        long len = file.length();
//        System.out.println(len);

        //lastModified
//        File file = new File("E:\\aa\\b.txt");
//        //1970.1.1
//        long time = file.lastModified();
//        System.out.println(time);
//        Date date = new Date(time);
//        System.out.println(date);
//        //创建日期转换类的对象 调用format方法进行日期的格式化
//        String d = new SimpleDateFormat("yyyy/MM/dd HH:mm").format(date);
//        System.out.println(d);

        //setReadOnly
//        File file = new File("E:\\aa\\b.txt");
//        boolean flag = file.setReadOnly();
//        System.out.println(flag);
        //setWritable
//        file.setWritable(true);

        //
//        File file = new File("E:\\aa\\b.txt");
////        //怎么获取当前时间
//////        String dateStr = "2019-12-21 08:00:09";
////        Date date = new Date();
////        file.setLastModified(date.getTime());
//////        file.setLastModified(date.getTime()-1000000000);
////        long time = file.lastModified();
////        Date date1 = new Date(time);
////        String d = new SimpleDateFormat("yyyy/MM/dd HH:mm").format(date1);
////        System.out.println(d);


    }
}
