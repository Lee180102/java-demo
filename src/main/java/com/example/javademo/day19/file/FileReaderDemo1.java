package com.example.javademo.day19.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //创建FileReader对象
        //如果给定路径的文件不存在 则运行抛出java.io.FileNotFoundException
        FileReader reader = new FileReader("D:/Temps/aa/b.txt");
//        File file = new File("D:/Temps/aa/b.txt");
//        FileReader reader = new FileReader(file);
//        System.out.println(reader);//地址值

        //通过read方法来读取文件中的数据
//        int i = reader.read();
//        System.out.println((char)i);
//        i = reader.read();
//        System.out.println((char)i);
//        i = reader.read();

        //循环获取文件中所有字符内容
        /*while(reader.read() != -1){//1
            int i = reader.read();//2
            System.out.println((char)i);
        }*/
        //read方法读取
//        int i;
//        while( (i = reader.read()) != -1){//1
//            System.out.println((char)i);
//        }
        //手动指定一个缓冲数组 提高效率
        char[] chars = new char[6];
//        int num = reader.read(chars);
//        System.out.println(num+"--"+ Arrays.toString(chars));
        int num;
        while((num = reader.read(chars))!=-1){
            System.out.println(new String(chars,0,num));
        }
    }
}
