package com.quercusdata.kafkademo.web;

import com.quercusdata.kafkademo.constants.Constant;
import com.quercusdata.kafkademo.kafka.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/message")
public class MessageWS {
    private static final Logger log = LoggerFactory.getLogger(MessageWS.class);

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping(value = {"/{message}"})
    public ResponseEntity<String> sendMessage(@PathVariable String message) {
        log.debug("Entering with message {}", message);
        try {
            kafkaProducer.send(message);
        }catch(Exception e) {
            return new ResponseEntity<>(Constant.FAILURE_IN_PROCESS, HttpStatus.FORBIDDEN);
        }
        log.debug("Leaving");
        return new ResponseEntity<>(Constant.SUCCESSFUL_PROCESS, HttpStatus.OK);
    }
}
