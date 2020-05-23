package com.example.javademo.message.dao;

import com.example.javademo.message.pojo.Message;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.util.List;
import java.util.Map;

/**
 * 专门负责与message数据库来打交道，
 * 对应将messageManager中的DBHelper属性改成MessageDao
 */
public class MessageDao {



    Map getMessageCountByUserIdAndId(String userId, int id) {
        return null;
    }

    List<Message> getMessageByUserIdAndId(String userId, int maxId, int type) {
        return null;
    }

    Map getMessageCountWithoutPushFailByUserId(String userId) {
        return null;
    }

}
