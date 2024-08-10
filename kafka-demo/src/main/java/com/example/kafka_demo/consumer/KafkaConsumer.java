package com.example.kafka_demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "myTopic")
    public void consumeMsg(String msg) {
        log.info("Consuming the message from myTopic:: {}", msg);
    }
}
