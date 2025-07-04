package com.rd.kafka.kafka_tutorial.controller;

import com.rd.kafka.kafka_tutorial.payload.User;
import com.rd.kafka.kafka_tutorial.service.JsonKafkaProducer;
import com.rd.kafka.kafka_tutorial.service.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/kafka")
public class APIControllerJson {

    private JsonKafkaProducer kafkaProducer;

    public APIControllerJson(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestBody User user) {
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Message sent to Kafka topic javaguides successfully: " + user.toString());
    }
}
