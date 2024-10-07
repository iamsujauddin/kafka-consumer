package com.kafka.consumer.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListner {

	Logger log=LoggerFactory.getLogger(KafkaMessageListner.class);
	
	@KafkaListener(topics = "kafka_demo_new",groupId = "kafka-grp1")
	public void consueme(String message) {
		log.info("message cosumed"+ message);
	}
}
