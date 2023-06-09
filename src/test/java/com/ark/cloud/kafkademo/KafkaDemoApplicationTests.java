package com.ark.cloud.kafkademo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootTest
class KafkaDemoApplicationTests {

	@Autowired
	KafkaTemplate kafkaTemplate;

	@Test
	void contextLoads() {
		for (int i = 0; i < 10; i++) {
			kafkaTemplate.send("es", 0, "key", String.valueOf(i));	
		}

		for (int i = 0; i < 5; i++) {
			kafkaTemplate.send("es", 2, "key", "星期" + i);	
		}
		
	}

}
