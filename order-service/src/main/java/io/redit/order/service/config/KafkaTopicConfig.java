package io.redit.order.service.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaTopicConfig {
    @Value("${spring.kafka.topic.name}")
    public String topicName;

    @Bean
    public NewTopic getTopic() {
        return  TopicBuilder
                .name(topicName)
                .partitions(3)
                .build();
    }
}
