package com.example.javademo.throwable;

public class ExceptionDemo8 {
    public static void main(String[] args) throws MyException{
        int score = -20;
        if(score<0||score>100){
            throw new MyException("成绩应该在0-100之间！");
        }
        /*try{
            System.out.println(5/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }*/
    }
}
