package com.example.javademo.day16.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        //创建对象
        Queue<String> queue = new LinkedList<String>();
        //添加元素
        queue.add("hello");
        queue.offer("world");
        System.out.println(queue);

        //如果队列为空时，抛出异常java.util.NoSuchElementException
        System.out.println(queue.element());
        //如果队列为空时，则返回null
        System.out.println(queue.peek());
    }
}
