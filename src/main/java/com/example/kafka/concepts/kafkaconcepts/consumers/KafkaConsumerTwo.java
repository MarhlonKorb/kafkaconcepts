package com.example.kafka.concepts.kafkaconcepts.consumers;

import com.example.kafka.concepts.kafkaconcepts.enums.Topic;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerTwo {

    @KafkaListener(topics = Topic.TOPIC_TWO_NAME)
    public void listenerTwo(String message) {
        System.out.println("Received Message: " + message);
    }
}
