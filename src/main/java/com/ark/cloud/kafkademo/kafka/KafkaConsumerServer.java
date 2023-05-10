package com.ark.cloud.kafkademo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * kafka消费者
 */

@Component
public class KafkaConsumerServer {
	
	@KafkaListener(groupId = "${spring.kafka.consumer.group-id}", topicPartitions = {@TopicPartition(topic = "${spring.kafka.template.es-topic}", partitions = "2")})
	private void listenPartitionTwoEsTopic(String record) {
		System.out.println("接收到分片2需要写入ES的消息: " + record);
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@KafkaListener(groupId = "${spring.kafka.consumer.group-id}", topicPartitions = {@TopicPartition(topic = "${spring.kafka.template.es-topic}", partitions = "0")})
	private void listenPartitionZeroEsTopic(String record) {
		System.out.println("接收到分片0需要写入ES的消息: " + record);
	}



}
