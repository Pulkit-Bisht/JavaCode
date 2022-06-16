package com.Oddles.Redis_PubSub.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;



public class Reciver implements MessageListener {

Logger logger=LoggerFactory.getLogger(Reciver.class);

    @Override
    public void onMessage(Message message, byte[] pattern) {
       logger.info("Consumed Event {} ",message);

    }
}
