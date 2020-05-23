package com.example.javademo.message.pojo;

import com.example.javademo.message.common.MessageBase;
import com.example.javademo.message.common.MessageTypeContent;

import java.text.MessageFormat;

public class WorkMessage extends MessageBase {
    //对应MessageType中的常量
    int messageType;


    WorkMessage(){
        messageStyle = MessageTypeContent.getInstance();
    }

    @Override
    public String getContent() {
        return MessageFormat.format((String) messageStyle.messageFormat.get(messageType),message.getContent());
    }

    @Override
    public String getTitle() {

        return MessageFormat.format((String) messageStyle.titleFormat.get(messageType),message.getUserId());

    }
}
