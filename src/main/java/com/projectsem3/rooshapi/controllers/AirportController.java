package com.projectsem3.rooshapi.controllers;

import com.projectsem3.rooshapi.controllers.dtos.request.AirportRequest;

import com.projectsem3.rooshapi.controllers.dtos.request.UpdateAirportRequest;
import com.projectsem3.rooshapi.domain.Airport;

import com.projectsem3.rooshapi.managers.AirportManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("airports")
public class AirportController extends GenericController<AirportRequest, Airport, UpdateAirportRequest>{
    @Autowired
    private AirportManager _manager;
    public AirportController(){
        super.classType = "Airport";
    }
}
