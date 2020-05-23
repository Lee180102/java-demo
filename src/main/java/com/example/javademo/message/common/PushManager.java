package com.example.javademo.message.common;

import com.example.javademo.message.pojo.Message;
import sun.security.jca.GetInstance;

import java.util.Map;

//Singleton
public class PushManager {

    String apiKeyAndroid;
    String apiKeyIOS;
    String secretKeyAndroid;
    String secretKeyIOS;
    Map<Integer, Object> clientCache;
    int DEVICE_TYPE_ANDROID;
    int DEVICE_TYPE_IOS;


    void pushMsgToSingleDevice(MessageManager messageManager) {

    }

    void pushMsgToTag(MessageManager messageManager) {

    }

    void pushMsgToAll(MessageManager messageManager) {

    }

    void push(MessageManager messageManager) {

    }

    PushManager getInstance(int deviceType) {
        return null;
    }

    Object getClient(int deviceType){
        return null;
    }

//    void logPushResponse(PushResponse response){
//
//    }

    boolean existsTag(){
        return false;
    }

    String createTag(){
        return null;
    }
}
