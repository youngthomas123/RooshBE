package com.projectsem3.rooshapi.mapper;

import com.projectsem3.rooshapi.domain.Airport;
import com.projectsem3.rooshapi.domain.Status;
import com.projectsem3.rooshapi.repositories.entity.Booking;
import com.projectsem3.rooshapi.repositories.entity.Provider;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class AirportConverter implements GenericConverter<Airport, com.projectsem3.rooshapi.repositories.entity.Airport>{
    @Override
    public List<Airport> returnDomainList(List<com.projectsem3.rooshapi.repositories.entity.Airport> objects) {
        List<Airport> bookings = new ArrayList();
        for(com.projectsem3.rooshapi.repositories.entity.Airport airport : objects){
            bookings.add(returnDomainObject(airport));
        }

        return bookings;
    }

    @Override
    public Airport returnDomainObject(com.projectsem3.rooshapi.repositories.entity.Airport object) {
        return new Airport(object.getId(), object.getName(), object.getCode(), object.getStreetname(), object.getStreetnumber(), object.getZipCode(), object.getCity(), object.getCountry(), object.getLongtitude(), object.getLatitude(), object.getTerminal());
    }

    @Override
    public com.projectsem3.rooshapi.repositories.entity.Airport returnEntity(Airport object) {
        ProviderConverter providerConverter = new ProviderConverter();
        return new com.projectsem3.rooshapi.repositories.entity.Airport(object.getId(), object.getName(), object.getCode(), object.getStreetname(), object.getStreetnumber(), object.getZipCode(), object.getCity(), object.getCountry(), object.getLongtitude(), object.getLatitude(), object.getTerminal());
    }
}
