package com.example.javademo.message.common;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
//Singleton

/**
 * 单例
 * 不同消息类型对应的内容模板和标题
 */
public class MessageTypeContent {

   public Map messageFormat;
   public Map titleFormat;

    static MessageTypeContent messageTypeContent;

    public MessageTypeContent() {
        Map<Object, Object> messageMap = new HashMap<>();
        messageMap.put(0, "工作内容：{0}");
        this.messageFormat = messageMap;
        Map<Object, Object> titleMap = new HashMap<>();
        titleMap.put(0, "{0}发来的工作通知");
        this.titleFormat = titleMap;
    }

    public static MessageTypeContent getInstance() {
        if (messageTypeContent == null) {
            messageTypeContent = new MessageTypeContent();
            return messageTypeContent;
        } else {
            return messageTypeContent;
        }
    }
}
