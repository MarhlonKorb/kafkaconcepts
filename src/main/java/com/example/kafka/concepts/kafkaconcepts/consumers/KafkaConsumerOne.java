package com.example.kafka.concepts.kafkaconcepts.consumers;

import com.example.kafka.concepts.kafkaconcepts.enums.Topic;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerOne {

    @KafkaListener(topics = Topic.TOPIC_ONE_NAME)
    public void listenerOne(String message) {
        System.out.println("Received Message: " + message);
    }
}
