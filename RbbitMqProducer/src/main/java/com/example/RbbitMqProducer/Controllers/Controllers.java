package com.example.RbbitMqProducer.Controllers;

import com.example.RbbitMqProducer.Publisher.RabbitMqPublisher;
import com.example.RbbitMqProducer.dto.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controllers {

    @Autowired
    private RabbitMqPublisher publisher;

    @PostMapping("/")
    public ResponseEntity<String> produceMessageToQueue(@RequestParam String message) {
        publisher.sendMsgToChromeQueue(message);
        return new ResponseEntity<>("message produced to queue successfully.", HttpStatus.OK);
    }

    @PostMapping("/sendJson")
    public ResponseEntity<String> test(@RequestBody StudentDetails sDetails) {
        publisher.sendMsgToJsonQueue(sDetails);

        return new ResponseEntity<>("sending jsonMsg to queue is successful", HttpStatus.OK);
    }


}
