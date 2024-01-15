package com.projectsem3.rooshapi.controllers;

import com.projectsem3.rooshapi.controllers.dtos.request.BookingRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.UpdateBookingRequest;
import com.projectsem3.rooshapi.domain.Booking;
import com.projectsem3.rooshapi.managers.BookingManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("Bookings")
public class BookingController extends GenericController<BookingRequest, Booking, UpdateBookingRequest>{
    @Autowired
    private BookingManager _manager;

    public BookingController(){
        super.classType = "Booking";
    }

    @GetMapping(value = "/search")
    public List<Booking> bookingSearch(@RequestParam String referenceNumber, @RequestParam String vendor){
        List<Booking> bookings = _manager.getItems();

        if (!referenceNumber.isEmpty())
            bookings = bookings
                    .stream()
                    .filter(b -> b.getReferenceNumber().toLowerCase().contains(referenceNumber.toLowerCase()))
                    .collect(Collectors.toList());
        if(!vendor.isEmpty())
            bookings = bookings
                    .stream()
                    .filter(b -> b.getVendor().toLowerCase().contains(vendor.toLowerCase()))
                    .collect(Collectors.toList());

        return bookings;
    }
}
