package com.oodles.rabbit_mq_consumer;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class CustomMessage {

    private String messageId;
    private String message;
    private String messageDate;
}
