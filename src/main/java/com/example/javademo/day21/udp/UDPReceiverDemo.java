package com.example.javademo.day21.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
/**
 * 此案例是UDP的接收端
 */
public class UDPReceiverDemo {
    public static void main(String[] args) throws IOException {
        //1\创建接收端的对象DatagramSocket，并指定端口号
        DatagramSocket ds = new DatagramSocket(3456);
        //2\准备接收数据的数据报包 DatagramPacket
        //第一个参数 指定一个byte数组，用于接收数据
        //第二个参数 指定数组可以使用的长度,byte数组
//        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
        //3\调用接收数据的方法
        ds.receive(dp);
        //4\关流
        ds.close();
        //5、解析数据报包 并打印
        byte[] data = dp.getData();
        System.out.println(new String(data,0,dp.getLength()));
    }
}
