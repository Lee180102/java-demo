package com.example.javademo.day16.vector;

import java.util.Vector;

/**
 * 使用数组实现栈
 */
public class Stack2 {
    private String[] arr = new String[10];
    // 代表栈中已存储的元素的个数
    private int size = 0;//1

    //empty如果为空就返回true
    public boolean empty(){
        return size<=0;
    }
    //push 放入元素
    public String push(String s){
        arr[size] = s;
        size++;
        return s;
    }
    //peek 返回栈顶元素  但不移除
    public String peek(){
        return arr[size-1];
    }
    //pop 移除栈顶元素，并返回该元素的内容
    public String pop(){
        String s = arr[size-1];
//        arr[size-1] = null;
        size--;
        return s;
    }
    // search查找 从栈顶开始向下查找，注意从1开始
    public int search(String s){
        for (int i = size-1; i>=0 ; i--) {
            String s1 = arr[i];
            if(s==s1||(s1!=null&&s1.equals(s))){
                return size-i;
            }
        }
        return -1;
    }
}
