package com.kafka.demo.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.kafka.demo.api.model.Person;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KafkaJsonProducer {

    public final KafkaTemplate<String, Person> kafkaTemplate;

    public void sendMessage(Person person) {
        Message<Person> message = MessageBuilder
                .withPayload(person)
                .setHeader(KafkaHeaders.TOPIC, "Test1")
                .build();

        kafkaTemplate.send(message);
    }

}
