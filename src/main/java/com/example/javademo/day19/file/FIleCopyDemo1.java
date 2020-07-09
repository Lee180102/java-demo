package com.example.javademo.day19.file;

import java.io.*;

public class FIleCopyDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("e:\\aa\\b.txt");
        //读取
        FileInputStream in = new FileInputStream(file);

        //输出
        FileOutputStream out = new FileOutputStream("e:\\aa\\bb\\"+file.getName());

        byte[] bytes = new byte[6];
        int num;
        while((num = in.read(bytes))!=-1){
            out.write(bytes,0,num);
        }

        in.close();
        out.close();
    }

}
