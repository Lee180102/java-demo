package com.example.javademo.day19.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("D:/Temps/aa/fff.txt");
//        out.write(97);
//        out.write('1');
        out.write("abcdef".getBytes());
        out.close();
    }
}
