package com.rd.kafka.kafka_tutorial.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    public static Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = {"javaguides"}, groupId = "myGroup")
    public void consumer(String message){
        LOGGER.info("KAFKA Consumer Message received: {}", message);
    }
}
