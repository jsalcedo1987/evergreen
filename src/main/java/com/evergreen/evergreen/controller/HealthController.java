package com.evergreen.evergreen.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<String> healthz (){

        String test;

        if(test!=null){
            return new ResponseEntity<String>("Ok", HttpStatus.OK);
        }

        return new ResponseEntity<String>("Ok", HttpStatus.OK);
        
    }

}
