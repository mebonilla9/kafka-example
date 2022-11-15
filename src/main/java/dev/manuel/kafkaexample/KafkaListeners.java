package dev.manuel.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

  @KafkaListener(
    topics = "kafkaExample",
    groupId = "groupId",
    containerFactory = "messageFactory"
  )
  void listener(Message data) {
    System.out.println("Listener received: ["+data.message()+"], xD");
  }

}
