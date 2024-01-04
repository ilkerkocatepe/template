package dev.ilkerk.template.presentation.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TemplateConsumer {
    @RabbitListener(queues = "template-queue")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }

    @KafkaListener(topics = "template-topic", groupId = "template-group-id")
    public void listenKafka(String message) {
        System.out.println("Received Message: " + message);
    }
}
