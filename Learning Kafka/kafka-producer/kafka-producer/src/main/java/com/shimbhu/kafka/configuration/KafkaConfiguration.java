package com.shimbhu.kafka.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    // create more partitions with configurations
    @Bean
    public NewTopic createTopic(){
        return new NewTopic("shimbhu4",3,(short) 1);
    }
}
