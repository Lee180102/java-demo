package com.example.javademo.message.service;

import com.example.javademo.message.common.MessageBase;
import com.example.javademo.message.dao.MessageDao;
import com.example.javademo.message.pojo.Message;

import javax.lang.model.element.NestingKind;
import java.util.List;
import java.util.Map;

public class MessageManagerService {
    private MessageDao messageDao;

    void addMessage(MessageBase messageBase) {

    }

    void pushWithUserLogin(String userId) {

    }

    void saveOrUpdateMessage(Message message) {

    }

    List<Map> getMessageByUserIDAndId(String userId, String maxId, int type) {
        return null;
    }

    void updateMessageStatus(int id, int status) {

    }

    void pushManagerWithMessageTypeBase(MessageBase messageBase) {

    }

    Map getMessageCountByUseridAndId(String userId, int id) {
        return null;
    }
}
