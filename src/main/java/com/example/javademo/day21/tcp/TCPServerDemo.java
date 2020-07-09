package com.example.javademo.day21.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 此案例为tcp的服务器端代码
 */
public class TCPServerDemo {
    public static void main(String[] args) throws IOException {
        //1、创建服务器端对象 ServerSocket
        ServerSocket ss = new ServerSocket(8888);
        //2、接受客户端的请求 accept -》Socket
        //accept阻塞
        Socket socket = ss.accept();
        //3、获取一个输入流
        InputStream in = socket.getInputStream();
        //4、读取数据
        byte[] bytes = new byte[1024];
        int len;
        while((len=in.read(bytes))!= -1){
            //打印数据
            System.out.println(new String(bytes,0,len));
        }
        //5、通知客户端数据读取完成
        socket.shutdownInput();
        //6 关闭流
        ss.close();
    }
}
