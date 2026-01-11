package com.shimbhu.kafka.service;

import com.shimbhu.kafka.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
@Slf4j
public class KafkaPublisherService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaPublisherService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishMessageToKafkaSynchronously(String message) {

        log.info("publishing messages to synchronously to kafka topic");
        // it will this topic by default with 1 partition if it is not exist
        CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send("hii-shimbhu", message);

        try {
            SendResult<String, Object> stringObjectSendResult = future.get();
            log.info(" result : {}", stringObjectSendResult.getProducerRecord());
            log.info(" metadata : {}", stringObjectSendResult.getRecordMetadata());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }

    public void publishMessageToKafkaASynchronously(String message) {

        log.info("publishing messages to asynchronously to kafka topic");

        CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send("shimbhu7", message);

        future.whenComplete((result, ex) -> {
            if (ex == null) {
                log.info("Message sent successfully with offset: {}",
                        result.getRecordMetadata().offset());
            } else {
                log.error("Failed to send user event: {}", ex.getMessage());
            }
        });

    }

    public void publishObjectMessageToKafkaASynchronously(User user) {

        log.info("publishing user messages to asynchronously to kafka topic");

        CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send("shimbhu4", user);

        future.whenComplete((result, ex) -> {
            if (ex == null) {
                log.info("Message sent successfully with offset: {}",
                        result.getRecordMetadata().offset());
                log.info("user published :"+user.toString());
            } else {
                log.error("Failed to send user event: {}", ex.getMessage());
            }
        });

    }

}
