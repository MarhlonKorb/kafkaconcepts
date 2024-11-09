package com.example.kafka.concepts.kafkaconcepts.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerOne {

    @KafkaListener(topics = "topicOne")
    public void listenerOne(String message) {
        System.out.println("Received Message: " + message);
    }
}
