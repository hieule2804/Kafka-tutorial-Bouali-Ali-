package com.Ziwllw.kafka.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducer {

  private final KafkaTemplate<String,String> kafkaTemplate;
    public void senMessage (String msg){
        log.info(format("Sending message to ziwllw Topic:: %s", msg));
      kafkaTemplate.send("ziwllw",msg);
  }
}
