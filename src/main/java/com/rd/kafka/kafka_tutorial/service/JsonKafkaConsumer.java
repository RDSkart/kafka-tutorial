package com.rd.kafka.kafka_tutorial.service;

import com.rd.kafka.kafka_tutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = {"javaguidejson"}, groupId = "myGroup")
    public void consumer(User user) {
        LOGGER.info(String.format("Json message recieved -> %s", user.toString()));
    }
}
