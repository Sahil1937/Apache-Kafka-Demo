package com.kafka.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.demo.api.model.Person;

@Service
public class KafkaJsonConsumer {

    @KafkaListener(topics = "Test1", groupId = "myGroup")
    public void consumeMessage(Person person) {
        System.out.println("Received Person Id is : " + person.getId());
        System.out.println("Received Person name is : " + person.getName());
    }

}
