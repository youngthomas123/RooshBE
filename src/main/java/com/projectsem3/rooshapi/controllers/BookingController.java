package com.projectsem3.rooshapi.controllers;

import com.projectsem3.rooshapi.controllers.dtos.request.BookingRequest;
import com.projectsem3.rooshapi.domain.Booking;
import com.projectsem3.rooshapi.managers.BookingManager;
import com.projectsem3.rooshapi.managers.OfficeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("Bookings")
public class BookingController extends GenericController<BookingRequest, Booking, BookingManager>{
    @Autowired
    private BookingManager _manager;

    @Autowired
    public BookingController(BookingManager bookingManager){
        super._manager = bookingManager;
        super.classType = "Booking";
    }
}
