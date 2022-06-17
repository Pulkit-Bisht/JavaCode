package com.oodles.springrabbitmq;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig {
    //yha pr Queue methoda bnao
    public static final String Queue = "Message Queue";
    public static final String EXCHANGE = "Message Exchange";

    public static final String ROUTING_KEY = "Message Exchange";

    @Bean
    public Queue queue() {
        return new Queue(Queue);
    }

    //ek queue bnayege
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE);
    }

    //last m une bind krege
    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue)
                .to(exchange)
                .with(ROUTING_KEY);
    }

    //Now make a msg converter whatever i pass in this convert into json
@Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
//@Bean
//    //Last make a rabbit mq template
//    public AmqpTemplate template(ConnectionFactory factory) {
//        RabbitTemplate template=new RabbitTemplate();
//        template.setMessageConverter(messageConverter());
//        return template;
//    }
@Bean
public AmqpTemplate template(ConnectionFactory connectionFactory) {
    RabbitTemplate template = new RabbitTemplate(connectionFactory);
    template.setMessageConverter(messageConverter());
    return  template;
}
}
