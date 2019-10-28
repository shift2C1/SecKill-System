package com.jsj.app.util;

import java.util.concurrent.ExecutionException;

/**
 * kafka消息队列工具类
 */
public interface KafkaUtils {
    /**
     * 发送消息到队列
     *
     * @param message
     */
    void send(Object message)throws Exception;

    /**
     * 接收消息
     *
     * @return
     */
    Object get();

}
