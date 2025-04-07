package com.example.rabbitmqdemo;

import com.example.rabbitmqdemo.service.MensagemProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitmqDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(MensagemProducer producer) {
        return args -> producer.enviarMensagem("Olá, RabbitMQ!");
    }

}
