package dev.ilkerk.template.application.producer;

import jakarta.annotation.PostConstruct;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitMessageProducer {
    private final AmqpAdmin amqpAdmin;

    private final AmqpTemplate amqpTemplate;

    public RabbitMessageProducer(AmqpAdmin amqpAdmin, AmqpTemplate amqpTemplate) {
        this.amqpAdmin = amqpAdmin;
        this.amqpTemplate = amqpTemplate;
    }

    @PostConstruct
    void init() {
        sendMessage("Hello, RabbitMQ!");
    }

    public void sendMessage(String message) {
        amqpTemplate.convertAndSend("template-exchange", "template-queue", message);
    }
}
