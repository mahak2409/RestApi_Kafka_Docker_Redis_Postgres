package com.example.demoRest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class Producer {
	
	//@Value("${topic.name.producer}")
    private String topicName = "users";
	
	@Autowired
     private KafkaTemplate<String, String> kafkaTemplate ;
     
     
     
    private static final Logger log = LoggerFactory.getLogger(Producer.class);


    public void send(String message){
    	
        log.info("Payload enviado: {}"+ message);
        System.out.println("Value "+kafkaTemplate);
       // if(kafkaTemplate != null)
        	kafkaTemplate.send(topicName, message);
    }


}
