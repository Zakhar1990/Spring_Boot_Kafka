package com.example.kafkaproject;

import com.example.kafkaproject.config.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "MyCode",
            groupId = "groupId"
    )

    void listener(Message data){
        System.out.println("Listener received: " + data );
    }
}
