package com.projectsem3.rooshapi.controllers.dtos.request.mappers;

import com.projectsem3.rooshapi.controllers.dtos.request.AirportRequest;
import com.projectsem3.rooshapi.domain.Airport;

public class AirportRequestMapper {
    public static Airport airportRequestToAirport(AirportRequest airportRequest){
        return new Airport(airportRequest.getName(),null,airportRequest.getStreetname(),airportRequest.getStreetnumber(),airportRequest.getCity(),airportRequest.getCountry(),airportRequest.getZipCode(),airportRequest.getLongtitude(),airportRequest.getLatitude());
    }
}
