package com.example.javademo.math;

public class MathDemo {
    public static void main(String[] args) {
        int num = getRandom(2,7);
        System.out.println(num);
    }
    //[start,end)
    public static int getRandom(int start,int end){
        return (int)(Math.random()*(end-start))+start;
    }
}
