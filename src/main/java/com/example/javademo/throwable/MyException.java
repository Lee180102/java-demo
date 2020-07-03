package com.example.javademo.throwable;

public class MyException extends Exception{
    public MyException(){
        super();
    }

    public MyException(String message){
        super(message);
    }
}
