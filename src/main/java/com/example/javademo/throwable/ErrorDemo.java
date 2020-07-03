package com.example.javademo.throwable;

public class ErrorDemo {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    //求100的和 100+sum(99)
    public static int sum(int num){
        /*if(num==0){
            return 0;
        }*/
        return num+sum(num-1);
    }
}
