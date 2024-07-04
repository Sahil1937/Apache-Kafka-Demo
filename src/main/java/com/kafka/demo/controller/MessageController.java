package com.kafka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.demo.api.model.Person;
import com.kafka.demo.producer.KafkaJsonProducer;

@RestController
public class MessageController {

    @Autowired
    KafkaJsonProducer kafkaJsonProducer;

    @PostMapping("/send/message")
    public HttpStatus sendMessage(@RequestBody Person person) {
        kafkaJsonProducer.sendMessage(person);
        return HttpStatus.OK;
    }

}
