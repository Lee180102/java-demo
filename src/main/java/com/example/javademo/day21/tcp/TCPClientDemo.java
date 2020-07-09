package com.example.javademo.day21.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * 此案例为tcp的客户端代码
 */
public class TCPClientDemo {
    public static void main(String[] args) throws IOException {
        //1、创建客户端对象  Socket
        Socket socket = new Socket();
        //2、发起连接服务器端的请求 connect
        //需要一个参数指定服务器端的ip地址和端口号
        socket.connect(new InetSocketAddress("127.0.0.1",8888));
        //3、获取一个输出流
        OutputStream out = socket.getOutputStream();
        //4 写出数据
        out.write("hello".getBytes());
        //5 通知服务器已经写出完成
        socket.shutdownOutput();
        //6 关闭客户端
        socket.close();

    }
}
