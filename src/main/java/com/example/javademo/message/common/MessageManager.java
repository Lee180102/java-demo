package com.example.javademo.message.common;

import com.example.javademo.message.pojo.Message;

import java.util.Map;


public class MessageManager {

    /**
     * 推送环境参数
     */

    //用来标识消息
    // 在业务层中将具体的消息类型传入
    MessageBase messageBase;
    //各种消息类型
    Map pushMessage;
    int deviceType;
    PushMessageType pushType;
    String tagName;
    String channelId;
    int deployStatus;

    void setPushMessage(Map pushMessage) {

    }

    MessageBase getMessageBase() {
        return null;
    }

    void setMessageBaseAndMessage(MessageBase messageBase, Message message) {

    }

    String getPushMessage() {
        return null;
    }

    Map getMessageMap() {
        return null;
    }
}
