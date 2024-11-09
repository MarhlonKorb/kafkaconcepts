package com.example.kafka.concepts.kafkaconcepts.services;

import com.example.kafka.concepts.kafkaconcepts.enums.Topic;
import com.example.kafka.concepts.kafkaconcepts.enums.TypeMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;

@Service
public final class KafkaPublisherAsyncServiceImpl implements KafkaPublisherService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaPublisherAsyncServiceImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendMessage(String message, Topic topic, TypeMessage typeMessage) {
        if (typeMessage == TypeMessage.SYNC) return;
        CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(topic.name(), message);
        future.whenComplete((result, exception) -> {
            if (exception == null) {
                System.out.println("Sent message=[" + message +
                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
            } else {
                System.out.println("Unable to send message=[" +
                        message + "] due to : " + exception.getMessage());
            }
        });
    }

}
