package com.example.javademo.message.common;

import com.example.javademo.message.pojo.Message;

import java.util.Map;

public abstract class MessageBase {

    public Message message;
    public MessageTypeContent messageStyle;

    public abstract String getContent();

    public abstract String getTitle();

//  JSONObject getParam(){
//      return null;
//  }
}
