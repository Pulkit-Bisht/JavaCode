package com.Oddles.Redis_PubSub.publisher;

import com.Oddles.Redis_PubSub.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Publisher {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    private ChannelTopic topic;

    @PostMapping("/publish")
    public String publis(@RequestBody Product product) {
        redisTemplate.convertAndSend(topic.getTopic(), product.toString());
        return "Event Published";
    }
}
