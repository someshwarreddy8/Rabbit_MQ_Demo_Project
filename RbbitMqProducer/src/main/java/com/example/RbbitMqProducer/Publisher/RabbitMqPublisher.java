package com.example.RbbitMqProducer.Publisher;

import com.example.RbbitMqProducer.dto.StudentDetails;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqPublisher {
    @Value("${rabbitMq.exchange}")
    private String exchange;
    @Value("${rabbitMq.routingKey}")
    private String routingKey;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Value("${rabbitMq.json.routingKey}")
    private String jsonRoutingKey;

    public void sendMsgToChromeQueue(String message) {
        System.out.println("message from producer : " + message);
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
    }

    public void sendMsgToJsonQueue(StudentDetails details) {
        System.out.println("details:::: " + details);
        rabbitTemplate.convertAndSend(exchange, jsonRoutingKey, details);
    }
}
