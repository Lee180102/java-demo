package com.example.javademo.day21.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
/**
 * 此案例是UDP的发送端
 */
public class UDPSenderDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的对象DatagramSocket
        DatagramSocket ds = new DatagramSocket();
        //准备数据报包 DatagramPacket
        //第一个参数：byte[] buf 表示要发送的数据
        String str = "helloworld";
        byte[] bytes = str.getBytes();
        //第二个参数：int length 发送数据的长度
        //第三个参数：SocketAddress address  InetSocketAddress
        InetSocketAddress isa = new InetSocketAddress("127.0.0.1",3456);
        DatagramPacket dp = new DatagramPacket(bytes,str.length(),isa);
        //调用方法发送数据
        ds.send(dp);
        //关流
        ds.close();
    }
}
