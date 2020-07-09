package com.example.javademo.day21.sd;

        import java.net.InetSocketAddress;

public class SocketAddressDemo {
    public static void main(String[] args) {
        //创建InetSocketAddress对象 表示IP和端口
        //第一个参数表示ip或者主机名
        //第二个参数表示端口号
        //127.0.0.1永远指向当前本机 localhost
        InetSocketAddress isa = new InetSocketAddress(
                "127.0.0.1",3344);
        //获取主机名
        //如果是本机，则会将主机名返回；如果是其他机器，则返回传入的ip地址
        System.out.println(isa.getHostName());
        //获取端口号
        System.out.println(isa.getPort());
    }
}
