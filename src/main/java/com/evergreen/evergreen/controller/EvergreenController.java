package com.evergreen.evergreen.controller;

import com.evergreen.evergreen.model.Plant;
import com.evergreen.evergreen.service.EvergreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvergreenController {

    @Autowired
    EvergreenService service;


    @GetMapping("/plant/{id}")
    public ResponseEntity<Plant> findPlanById (@PathVariable Integer id){
        Plant response = service.getPlanInformationById(id);
        return new ResponseEntity<Plant>(response, HttpStatus.OK);
    }

}
