package com.kafka.demo.consumer;

import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    // @KafkaListener(topics = "Test1", groupId = "myGroup")
    public void consumeMessage(String message) {
        System.out.println("Received Message is: " + message);
    }

}
