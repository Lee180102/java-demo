package com.example.javademo.day19.file;

import java.io.*;

public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        //文件字符输入流
        File file = new File("e:\\aa\\b.txt");
        FileReader reader = new FileReader(file);

        //创建输出对象
        FileWriter writer = new FileWriter("e:\\aa\\bb\\"+file.getName());

        //读取数据
        char[] chars = new char[6];
        int num;
        while((num=reader.read(chars)) != -1){
            //chars已经存储了一部分数据，就把这部分数据写入到复制的文件中
            writer.write(chars,0,num);
            writer.flush();
        }
        //在流关闭之前无法删除文件
//        file.delete();//false

        reader.close();
        writer.close();
        //可以实现剪切的功能
//        file.delete();


    }
}
