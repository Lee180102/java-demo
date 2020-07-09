package com.example.javademo.day21.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

/**
 * 此案例演示通过UDP实现单人聊天
 * 结合线程来完成
 */
public class ChatUDPDemo {
    public static void main(String[] args) {
        //创建对象 启动
        new Thread(new ChatReceiver()).start();
        new Thread(new ChatSender()).start();
    }
}
//定义发送端的类 实现Runnable接口
class ChatSender implements Runnable{

    @Override
    public void run() {
        try {
            //定义udp发送数据类
            DatagramSocket ds = new DatagramSocket();
            //准备Scanner对象用于获取用于输入的数据
            Scanner sc = new Scanner(System.in);
            while(true){
                //不断获取用户输入的一行字符串
                //阻塞
                String msg = sc.next();
                //创建数据报包
                DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),
                    new InetSocketAddress("255.255.255.255",6666));
                //发送数据
                ds.send(dp);
                //end
                if("end".equals(msg)){
                    //说明用户输入了end 表示想结束发送数据
                    break;
                }
            }
            //当不再发送数据时，关闭流
            ds.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
//定义接收端的类 实现Runnable接口
class ChatReceiver implements Runnable{

    @Override
    public void run() {
        try {
            //接收端的类
            DatagramSocket ds = new DatagramSocket(6666);
            while(true){
                //准备接收数据的数据报包
                byte[] bytes = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
                //接收数据
                //阻塞
                ds.receive(dp);
                //解析数据
                String msg = new String(dp.getData(),0,dp.getLength());
                if("end".equals(msg)){
                    System.out.println(dp.getAddress().getHostName()+"已下线");
                    break;
                }
                System.out.println(dp.getAddress().getHostName()+"给您发送了一条消息："+msg);
            }
            //关流
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
