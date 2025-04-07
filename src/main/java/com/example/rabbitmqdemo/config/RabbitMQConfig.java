package com.example.rabbitmqdemo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String QUEUE = "fila.mensagem";
    public static final String EXCHANGE = "exchange.mensagem";
    public static final String ROUTING_KEY = "mensagem.chave";

    @Bean
    public Queue fila() {
        return new Queue(QUEUE, false);
    }

    @Bean
    public DirectExchange exchanger() {
        return new DirectExchange(EXCHANGE);
    }

    @Bean
    public Binding binding(Queue fila, DirectExchange exchange) {
        return BindingBuilder.bind(fila).to(exchange).with(ROUTING_KEY);
    }
}
