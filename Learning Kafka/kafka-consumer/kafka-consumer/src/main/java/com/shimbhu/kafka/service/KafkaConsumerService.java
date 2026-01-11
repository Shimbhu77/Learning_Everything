package com.shimbhu.kafka.service;

import com.shimbhu.kafka.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "shimbhu7", groupId = "shimbhu-consumer-group")
    public void consumeService(String message){
        log.info("message consumed by the consumer : "+message);
    }

    @KafkaListener(topics = "shimbhu4", groupId = "shimbhu-consumer-group")
    public void consumeService(User user){
        log.info("message consumed by the consumer : "+user.toString());
    }
}
