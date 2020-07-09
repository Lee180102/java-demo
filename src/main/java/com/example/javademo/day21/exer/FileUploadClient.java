package com.example.javademo.day21.exer;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * 此案例为tcp的练习文件上传的客户端代码
 */
public class FileUploadClient {
    public static void main(String[] args) throws IOException {
//        1、创建客户端对象
        Socket socket = new Socket();
//        2、连接服务器端
        socket.connect(new InetSocketAddress("127.0.0.1", 8899));
//        3、输入流，读取本地文件
        File file = new File("c:\\jdk.CHM");
        FileInputStream in = new FileInputStream(file);


//        4、获取一个输出流
        OutputStream out = socket.getOutputStream();
        //获取文件名
        String fileName = file.getName();
        //先写出文件名的长度
        out.write(fileName.length());
        //再写出文件名名称
        out.write(fileName.getBytes());

//        5、读取本地文件，一边发送给服务器端
        byte[] bytes = new byte[1024];
        int len;
        while ((len = in.read(bytes)) != -1) {
            //将一部分数据读取到了bytes数组中
            //将bytes内容发送到服务器端
            out.write(bytes, 0, len);
        }
//        6、通知服务器端文件发送完成
        socket.shutdownOutput();

        //新增功能 获取服务器端的回复数据并打印
        InputStream in1 = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int len1;
        while ((len1 = in1.read(bytes1))!=-1){
            String msg = new String(bytes1,0,len1);
            System.out.println(msg);
        }
        //通知服务器端数据读取完成
        socket.shutdownInput();
//        7、关闭所有流
        socket.close();
        in.close();
    }
}
