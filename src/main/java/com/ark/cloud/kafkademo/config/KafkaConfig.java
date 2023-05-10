package com.ark.cloud.kafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
	/**
	 * 新建一个主题
	 */
	@Bean
	public NewTopic topic() {
		return TopicBuilder.name("es")
		.partitions(3)
		.replicas(1).build();
	}
}
