package com.shimbhu.kafka.controller;

import com.shimbhu.kafka.model.User;
import com.shimbhu.kafka.service.KafkaPublisherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublishController {

    private final KafkaPublisherService kafkaPublisherService;

    public PublishController(KafkaPublisherService kafkaPublisherService) {
        this.kafkaPublisherService = kafkaPublisherService;
    }

    @GetMapping("/kafka/publish-message")
    public ResponseEntity<String> publishMessageToKafkaTopic(@RequestParam String message){
        kafkaPublisherService.publishMessageToKafkaSynchronously(message);
        String result = "Message publish to kafka successfully";
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/kafka/async/publish-message")
    public ResponseEntity<String> publishAsyncMessageToKafkaTopic(@RequestParam String message){
        for(int i=0;i<5000;i++){
            String result = message+" , you are doing great : "+i;
            kafkaPublisherService.publishMessageToKafkaASynchronously(result);
        }
        String result = "Message publish to kafka Asynchronously successfully.";
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/kafka/async/object-message")
    public ResponseEntity<String> publishAsyncObjectMessageToKafkaTopic(@RequestBody User user){
        kafkaPublisherService.publishObjectMessageToKafkaASynchronously(user);
        String result = "Message publish to kafka Asynchronously successfully.";
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
