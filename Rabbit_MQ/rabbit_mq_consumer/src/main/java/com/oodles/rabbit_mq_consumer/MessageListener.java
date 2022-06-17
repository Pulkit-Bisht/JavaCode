package com.oodles.rabbit_mq_consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @RabbitListener(queues = MQConfig.Queue)
    public void listner(CustomMessage message){
        System.out.println(message);

    }
}
