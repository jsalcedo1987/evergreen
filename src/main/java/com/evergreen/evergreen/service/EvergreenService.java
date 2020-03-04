package com.evergreen.evergreen.service;

import com.evergreen.evergreen.model.Plant;
import com.evergreen.evergreen.repository.EvergreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvergreenService {


    @Autowired
    EvergreenRepository repository;

    public Plant getPlanInformationById (Integer id){

        Plant myPlant = repository.findById(id);
        return myPlant;

    }


}
