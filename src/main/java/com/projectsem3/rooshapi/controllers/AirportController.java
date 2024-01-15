package com.projectsem3.rooshapi.controllers;

import com.projectsem3.rooshapi.controllers.dtos.request.AirportRequest;

import com.projectsem3.rooshapi.controllers.dtos.request.UpdateAirportRequest;
import com.projectsem3.rooshapi.domain.Airport;

import com.projectsem3.rooshapi.managers.AirportManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("airports")
public class AirportController extends GenericController<AirportRequest, Airport, UpdateAirportRequest>{
    @Autowired
    private AirportManager _manager;
    public AirportController(){
        super.classType = "Airport";
    }

    @GetMapping(value = "/search")
    public List<Airport> airportSearch(@RequestParam String city, @RequestParam String country){
        List<Airport> airports = _manager.getItems();
        if(!city.isEmpty())
            airports = airports
                    .stream()
                    .filter(a -> a.getCity().toLowerCase().contains(city.toLowerCase()))
                    .collect(Collectors.toList());
        if(!country.isEmpty())
            airports = airports
                    .stream()
                    .filter(a -> a.getCountry().toLowerCase().contains(country.toLowerCase()))
                    .collect(Collectors.toList());

        return airports;
    }
}
