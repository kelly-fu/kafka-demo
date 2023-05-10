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


	@GetMapping("/sendZero")
	public void sendZero() {
		//for (int i = 0; i < 10; i++) {
		//	kafkaTemplate.send("es", 0, "key", String.valueOf(i));
		//}
		kafkaTemplate.send("es", 0, "key", String.valueOf("分片0是我"));

		//for (int i = 0; i < 5; i++) {
		//	kafkaTemplate.send("es", 2, "key", "星期" + i);	
		//}
	}

	@GetMapping("/sendTwo")
	public void sendTwo() {
		//for (int i = 0; i < 10; i++) {
		//	kafkaTemplate.send("es", 0, "key", String.valueOf(i));
		//}
		kafkaTemplate.send("es", 2, "key", String.valueOf("我是分片2"));

		//for (int i = 0; i < 5; i++) {
		//	kafkaTemplate.send("es", 2, "key", "星期" + i);	
		//}
	}

	@GetMapping("/sendOne")
	public void sendOne() {
		//for (int i = 0; i < 10; i++) {
		//	kafkaTemplate.send("es", 0, "key", String.valueOf(i));
		//}
		kafkaTemplate.send("es", 1, "key", String.valueOf("我是分片1"));

		//for (int i = 0; i < 5; i++) {
		//	kafkaTemplate.send("es", 2, "key", "星期" + i);	
		//}
	}


	
	
}
