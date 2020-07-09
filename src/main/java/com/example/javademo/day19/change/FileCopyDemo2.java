package com.example.javademo.day19.change;

import java.io.*;

public class FileCopyDemo2 {
    public static void main(String[] args) throws IOException {
        //文件复制
        File file = new File("e:\\aa\\b.txt");
        FileInputStream in = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(in,"GBK");

        //输出流
        FileOutputStream out = new FileOutputStream("e:\\aa\\bb\\"+file.getName());
        OutputStreamWriter writer = new OutputStreamWriter(out,"GBK");

        //指定一个缓冲数组
        char[] chars = new char[6];
        int num;
        while((num = reader.read(chars))!=-1){
            writer.write(chars,0,num);
        }
        //因为out是writer包裹的一个类，当调用writer的close方法时。底层默认会调用out
        //的close方法；所以如果在writer.close之前关闭了out则运行程序会报错
//        out.close();
        writer.close();
//        in.close();
        reader.close();

    }
}
