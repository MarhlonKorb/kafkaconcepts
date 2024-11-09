package com.example.kafka.concepts.kafkaconcepts.services;

import com.example.kafka.concepts.kafkaconcepts.enums.Topic;
import com.example.kafka.concepts.kafkaconcepts.enums.TypeMessage;

public sealed interface KafkaPublisherService permits KafkaPublisherAsyncServiceImpl, KafkaPublisherSyncServiceImpl {

    void sendMessage(String message, Topic topic, TypeMessage typeMessage);
}
