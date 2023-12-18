package com.projectsem3.rooshapi.managers.facade;

import com.projectsem3.rooshapi.controllers.dtos.request.BookingRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.OfficeRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.mappers.BookingRequestMapper;
import com.projectsem3.rooshapi.controllers.dtos.request.mappers.OfficeRequestMapper;
import com.projectsem3.rooshapi.domain.Booking;
import com.projectsem3.rooshapi.managers.BookingManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class BookingManagerFacade {
    @Autowired
    private BookingManager _manager;

    public List<Booking> getItems() {
        return _manager.getItems();
    }

    public Booking getItemById(UUID id) {
        return _manager.getItemById(id);
    }

    public Boolean addItem(BookingRequest item) {
        return _manager.addItem(BookingRequestMapper.bookingRequestToBooking(item));
    }

    public Boolean removeItem(UUID item) {
        return _manager.removeItem(item);
    }

    public Boolean updateItem(BookingRequest item) {
        return _manager.updateItem(BookingRequestMapper.bookingRequestToBooking(item));
    }
}
