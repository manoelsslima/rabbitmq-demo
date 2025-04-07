package com.example.rabbitmqdemo.service;

import com.example.rabbitmqdemo.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class MensagemProducer {
    private final RabbitTemplate rabbitTemplate;

    public MensagemProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando: " + mensagem);
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, mensagem);
    }
}
