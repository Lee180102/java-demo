package com.example.javademo.day19.other;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("e:\\aa\\file4.txt");
        ps.print("aaaaabbbbbdmkjkjk");
        ps.flush();
        ps.close();

        char[] arr = new char[]{'a','b'};
        System.out.println(arr);

        ps.print(new Object());//toString
    }
}
