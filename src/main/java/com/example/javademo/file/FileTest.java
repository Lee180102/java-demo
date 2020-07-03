package com.example.javademo.file;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {

    private static File fileInfo = new File("D:/a.txt");

    private FileTest() {
    }

    public static File getFileInfo() {
        return fileInfo;
    }

    public static void main(String[] args) throws IOException {
       FileTest.fileMethods();
    }


    public static void fileBaseProperty() {
        //文件字节量
        long length = fileInfo.length();
        System.out.println(length);
        //是否存在
        boolean exists = fileInfo.exists();
        System.out.println(exists);
        //是否是文件
        boolean file = fileInfo.isFile();
        System.out.println(file);
        //是否是文件加
        boolean directory = fileInfo.isDirectory();
        System.out.println(directory);
        //获取文件名
        String name = fileInfo.getName();
        System.out.println(name);
        //获取父文件夹的路径
        String parent = fileInfo.getParent();
        System.out.println(parent);
        //获取文件的完整路径
        String absolutePath = fileInfo.getAbsolutePath();
        System.out.println(absolutePath);
    }


    public static   void fileMethods() throws IOException {
        File file = new File("D:/a/b.txt");
        //新建文件，文件夹不存在会异常，文件已经存在返回false
        System.out.println( file.createNewFile());

        file = new File("D:/a/b/c");
        //新建多层不存在的文件夹\a\b\c
        System.out.println(file.mkdirs());
        file = new File("D:/a/a");
        //新建单层不存在的文件夹\a
        System.out.println(file.mkdir());
        //删除文件，删除空文件夹
        System.out.println(file.delete());

        file = new File("D:/a");
        //返回String[]，包含文件名
        System.out.println(Arrays.toString(file.list()));
        //返回File[]，包含文件对象
        System.out.println(Arrays.toString(file.listFiles()));

    }


}
