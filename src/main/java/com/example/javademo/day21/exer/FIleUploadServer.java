package com.example.javademo.day21.exer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 此案例为tcp的练习文件上传的服务器端代码
 */
public class FIleUploadServer {
    public static void main(String[] args) throws IOException {
////        1、创建服务器对象
        ServerSocket ss = new ServerSocket(8899);
//        2、接受客户端连接请求--阻塞
        Socket socket = ss.accept();
//        3、获取一个输入流
        InputStream in = socket.getInputStream();

        //先读文件名的长度 1
        int length = in.read();
        //再读文件名称
        byte[] b = new byte[length];
        in.read(b);
        String filename = new String(b);

//        4、准备一个输出流 将数据写出到e
        FileOutputStream out = new FileOutputStream("e:\\"+filename);
//        5、一边通过输入流读取客户端发送的数据，一边写出到e

        byte[] bytes = new byte[1024];
        int len;
        while((len=in.read(bytes))!=-1){
            //当前已经接收了客户端发送的一部分的数据
            //将这部分数据写出到e盘
            out.write(bytes,0,len);
        }
//        6、通知客户端文件接收完成
        socket.shutdownInput();

        //新增一个功能 当文件接收完成，给客户端一个回复
        OutputStream out1 = socket.getOutputStream();
        out1.write("文件上传成功".getBytes());
        //通知客户端数据写出完成
        socket.shutdownOutput();
//        7、关闭所有流
        ss.close();
        out.close();
    }
}
