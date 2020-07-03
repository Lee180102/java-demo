package com.example.javademo.throwable;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        try{
            System.out.println(5/0);
        }catch (ArithmeticException e){
            System.out.println("有问题");
            try {
                System.out.println(6 / 0);
            }catch(Exception e1){
                e1.printStackTrace();
                System.out.println("hello");
            }
        }
    }
}
