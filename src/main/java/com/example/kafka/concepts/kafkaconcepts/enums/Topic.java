package com.example.kafka.concepts.kafkaconcepts.enums;

public enum Topic {
    TOPIC_ONE("topicOne"),
    TOPIC_TWO("topicTwo");

    private final String topicName;

    // Construtor para associar o valor ao enum
    Topic(String topicName) {
        this.topicName = topicName;
    }

    // Getter para retornar o valor associado
    public String getTopicName() {
        return topicName;
    }

    public static final String TOPIC_ONE_NAME = "topicOne";
    public static final String TOPIC_TWO_NAME = "topicTwo";
}

