package com.projectsem3.rooshapi.managers.facade;

import com.projectsem3.rooshapi.controllers.dtos.request.AirportRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.BookingRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.UpdateAirportRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.UpdateBookingRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.mappers.AirportRequestMapper;
import com.projectsem3.rooshapi.controllers.dtos.request.mappers.BookingRequestMapper;
import com.projectsem3.rooshapi.domain.Airport;
import com.projectsem3.rooshapi.domain.Booking;
import com.projectsem3.rooshapi.managers.AirportManager;
import com.projectsem3.rooshapi.managers.BookingManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AirportManagerFacade {
    @Autowired
    private AirportManager _manager;

    public List<Airport> getItems() {
        return _manager.getItems();
    }

    public Airport getItemById(UUID id) {
        return _manager.getItemById(id);
    }

    public UUID addItem(AirportRequest item) {
        return _manager.addItem(AirportRequestMapper.airportRequestToAirport(item));
    }

    public Boolean removeItem(UUID item) {
        return _manager.removeItem(item);
    }

    public Boolean updateItem(UpdateAirportRequest item) {
        return _manager.updateItem(AirportRequestMapper.UpdateairportRequestToAirport(item));
    }
}
