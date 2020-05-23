package com.example.javademo.message.common;

import java.util.Map;

/**
 * 枚举类型来标识消息的推送类型（即单推，群推，组推等）
 */
public enum  PushMessageType {
    pushMsgToSingleDevice,
    pushMsgToAll,
    pushMsgToTag,
    pushMsgToSmartTag,
    pushBatchUniMsg

}
