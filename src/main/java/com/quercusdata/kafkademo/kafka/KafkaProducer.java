package com.quercusdata.kafkademo.kafka;

import com.quercusdata.kafkademo.constants.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
        kafkaTemplate.send(Constant.GENERAL_TOPIC, message);
    }
}
