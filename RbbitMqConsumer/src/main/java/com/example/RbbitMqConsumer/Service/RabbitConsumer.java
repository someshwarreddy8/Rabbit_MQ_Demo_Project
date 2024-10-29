package com.example.RbbitMqConsumer.Service;

import com.example.RbbitMqConsumer.dto.StudentDetails;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitConsumer {
    @RabbitListener(queues = {"${rabbitMq.queue}"})
    public void rabbitConsumer(String message) {
        System.out.println("message from queue is : " + message);
    }

    @RabbitListener(queues = {"${rabbitMq.json.queue}"})
    public void jsonMsgConsumer(StudentDetails details) {
        System.out.println("json msg : "+details);
    }


}
