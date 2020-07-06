package com.example.javademo.day16.vector;

import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        //创建Stack对象
        Stack<String> stack = new Stack<String>();
        //		boolean empty()
        //          测试堆栈是否为空。
        System.out.println(stack.empty());//如果为空返回true
        //		 E peek()
        //          查看堆栈顶部的对象，但不从堆栈中移除它
        //如果栈为空，调用peek方法则会抛出异常java.util.EmptyStackException
//        System.out.println(stack.peek());
        //E push(E item)
        //          把项压入堆栈顶部。
        stack.push("白骨精");
        stack.push("蜘蛛精");
        stack.push("金角大王");
        stack.push("银角大王");

        System.out.println(stack);

        System.out.println(stack.peek());//银角大王

//        		 E pop()
//                  移除堆栈顶部的对象，并作为此函数的值返回该对象。

        String s = stack.pop();
        System.out.println(s);
        System.out.println(stack);

//        int search(Object o)
//        返回对象在堆栈中的位置，以 1 为基数

        System.out.println(stack.search("蜘蛛精"));
    }
}
