package com.example.javademo.day16.vector;

import java.util.Stack;
import java.util.Vector;

/**
 * 使用Vector实现栈
 */
public class Stack1 {
    private Vector<String> vector = new Vector<String>();
    //empty如果为空就返回true
    public boolean empty(){
        return vector.isEmpty();
    }
    //push 放入元素
    public String push(String s){
        vector.add(s);
        return s;
    }
    //peek 返回栈顶元素  但不移除
    public String peek(){
       return vector.get(vector.size()-1);
    }
    //pop 移除栈顶元素，并返回该元素的内容
    public String pop(){
        String s = peek();//2
//        //1 2 1 3 2
//        vector.remove(s);
        vector.remove(vector.size()-1);
        return s;
    }
    // search查找 从栈顶开始向下查找，注意从1开始
    public int search(String s){
        for (int i = vector.size()-1; i>=0 ; i--) {
            String s1 = vector.get(i);
            if(s==s1||(s1!=null&&s1.equals(s))){
                return vector.size()-i;
            }
        }
        return -1;
    }
}
