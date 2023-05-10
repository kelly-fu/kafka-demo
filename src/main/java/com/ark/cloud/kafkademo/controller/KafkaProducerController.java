package com.ark.cloud.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class KafkaProducerController {

	@Autowired
	KafkaTemplate kafkaTemplate;


	@GetMapping("/send")
	public void test() {
		for (int i = 0; i < 10; i++) {
			kafkaTemplate.send("es", 0, "key", String.valueOf(i));	
		}

		for (int i = 0; i < 5; i++) {
			kafkaTemplate.send("es", 2, "key", "星期" + i);	
		}
	}


	
	
}
