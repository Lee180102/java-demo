package com.example.javademo.day21.tcp.go;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket receiverServerSocket = new ServerSocket(8899);
            Socket receiverSocket = receiverServerSocket.accept();
            InputStream inputStream = receiverSocket.getInputStream();
            Receiver receiver = new Receiver(inputStream);
            Thread receiverThread = new Thread(receiver);
//            receiverThread.setDaemon(true);
//            Socket senderSocket = new Socket();
//            senderSocket.connect(new InetSocketAddress("127.0.0.1", 8888));
//            OutputStream outputStream = senderSocket.getOutputStream();
//            Scanner scanner = new Scanner(System.in);
//            Sender sender = new Sender(outputStream, scanner);
//            Thread senderThread = new Thread(sender);
            receiverThread.start();
//            senderThread.start();
//            senderSocket.shutdownOutput();
//            outputStream.close();
//            receiverSocket.shutdownInput();
//            inputStream.close();
//            receiverServerSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class Receiver implements Runnable {

    InputStream inputStream;

    public Receiver(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        System.out.println("Receiver start");

        out:
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Receiver.class) {
                int length;
                byte[] bytes = new byte[1024];
                try {
                    while ((length = inputStream.read(bytes)) != -1) {
                        String message = new String(bytes, 0, length);
                        if (message.equals("end")) break out;
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}

