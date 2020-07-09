package com.example.javademo.day18.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo6 {
    public static void main(String[] args) {
        File file = new File("E:\\aa");
//        String[] str = file.list(new FilenameFilter() {
//            @Override
//            //dir 当前文件所在目录的路径
//            //name 当前文件名称
//            public boolean accept(File dir, String name) {
////                System.out.println(dir+"----"+name);
//                //如果文件是.txt文件 则返回true
//                return !name.endsWith(".txt");
//            }
//        });
//        System.out.println(Arrays.toString(str));

        /*File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName();
                return name.endsWith(".txt");
            }
        });
        for(File f:files){
            System.out.println(f);
        }*/
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
    }
}
