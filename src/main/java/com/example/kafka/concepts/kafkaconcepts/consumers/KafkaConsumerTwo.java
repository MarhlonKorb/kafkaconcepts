package com.example.kafka.concepts.kafkaconcepts.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerTwo {

    @KafkaListener(topics = "topicTwo")
    public void listenerTwo(String message) {
        System.out.println("Received Message: " + message);
    }
}
