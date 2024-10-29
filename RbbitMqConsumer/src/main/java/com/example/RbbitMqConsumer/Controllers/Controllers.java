package com.example.RbbitMqConsumer.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("successful", HttpStatus.OK);
    }


}
