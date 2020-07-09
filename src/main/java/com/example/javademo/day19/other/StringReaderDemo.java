package com.example.javademo.day19.other;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderDemo {
    public static void main(String[] args) throws IOException {
        String str = "ajkfhdjk";
        System.out.println(str);
        StringReader reader = new StringReader(str);
        int ch;
        while((ch=reader.read())!=-1){
            System.out.println((char)ch);
        }

//        int ch = reader.read();

    }
}
