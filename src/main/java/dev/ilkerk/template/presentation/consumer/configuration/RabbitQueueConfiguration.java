package dev.ilkerk.template.presentation.consumer.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitQueueConfiguration {

    static final String templateExchangeName = "template-exchange";

    static final String templateQueueName = "template-queue";

    @Bean
    public Queue templateQueue() {
        return new Queue(templateQueueName, false);
    }

    @Bean
    TopicExchange templateExchange() {
        return new TopicExchange(templateExchangeName);
    }

    @Bean
    Binding templateBinding() {
        return BindingBuilder.bind(templateQueue()).to(templateExchange()).with(templateQueueName);
    }
}
