package com.example.rabbitmqdemo.service;

import com.example.rabbitmqdemo.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MensagemConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void receberMensagem(String mensagem) {
        System.out.println("Recebido: " + mensagem);
    }
}
