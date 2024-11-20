package com.example.kafka.concepts.kafkaconcepts.services;

import com.example.kafka.concepts.kafkaconcepts.enums.Topic;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public final class KafkaPublisherSyncServiceImpl implements KafkaPublisherService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaPublisherSyncServiceImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendMessage(String message, Topic topic) {
        kafkaTemplate.send(topic.name(), message);
    }

}
