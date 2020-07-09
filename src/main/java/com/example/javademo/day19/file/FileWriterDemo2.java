package com.example.javademo.day19.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
    public static void main(String[] args) {
        //创建FileWriter对象
        FileWriter writer = null;
        try {
            writer = new FileWriter("e:\\aa\\file.txt");
            //写出字符串
            writer.write("123456");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    writer=null;
                }
            }
        }



    }
}
