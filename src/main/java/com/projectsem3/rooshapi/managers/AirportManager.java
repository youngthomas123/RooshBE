package com.projectsem3.rooshapi.managers;

import com.projectsem3.rooshapi.domain.Airport;
import com.projectsem3.rooshapi.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportManager extends GenericManager<Airport, AirportRepository>{
    @Autowired
    public AirportManager(AirportRepository airportRepository){
        super._repo = airportRepository;
    }

}
