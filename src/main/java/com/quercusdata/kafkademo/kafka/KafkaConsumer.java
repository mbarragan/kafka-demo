package com.quercusdata.kafkademo.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener
    public void consume(String message) {
        log.info("KafkaConsumer consumes message:{}", message);
    }
}
