package com.projectsem3.rooshapi.controllers.dtos.request.mappers;

import com.projectsem3.rooshapi.controllers.dtos.request.AirportRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.UpdateAirportRequest;
import com.projectsem3.rooshapi.domain.Airport;
import com.projectsem3.rooshapi.domain.Provider;

import java.util.UUID;

public class AirportRequestMapper {
    public static Airport airportRequestToAirport(AirportRequest airportRequest){
        if (airportRequest.getProviderId() == null)
            return new Airport(airportRequest.getName(),null, airportRequest.getCode(), airportRequest.getStreetname(),airportRequest.getStreetnumber(),airportRequest.getCity(),airportRequest.getCountry(),airportRequest.getZipCode(),airportRequest.getLongtitude(),airportRequest.getLatitude(),airportRequest.getTerminal());
        else if (airportRequest.getProviderId().equals(""))
            return new Airport(airportRequest.getName(),null, airportRequest.getCode(), airportRequest.getStreetname(),airportRequest.getStreetnumber(),airportRequest.getCity(),airportRequest.getCountry(),airportRequest.getZipCode(),airportRequest.getLongtitude(),airportRequest.getLatitude(),airportRequest.getTerminal());
        else
        return new Airport(airportRequest.getName(),new Provider(UUID.fromString(airportRequest.getProviderId())), airportRequest.getCode(), airportRequest.getStreetname(),airportRequest.getStreetnumber(),airportRequest.getCity(),airportRequest.getCountry(),airportRequest.getZipCode(),airportRequest.getLongtitude(),airportRequest.getLatitude(),airportRequest.getTerminal());

    }
    public static Airport UpdateairportRequestToAirport(UpdateAirportRequest airportRequest){
        return new Airport(airportRequest.getId(),airportRequest.getName(),null,airportRequest.getStreetname(),airportRequest.getStreetnumber(),airportRequest.getCity(),airportRequest.getCountry(),airportRequest.getZipCode(),airportRequest.getLongtitude(),airportRequest.getLatitude(),airportRequest.getTerminal());

    }

}
