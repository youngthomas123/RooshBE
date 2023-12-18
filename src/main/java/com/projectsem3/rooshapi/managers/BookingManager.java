package com.projectsem3.rooshapi.managers;

import com.projectsem3.rooshapi.domain.Booking;
import com.projectsem3.rooshapi.repositories.BookingRepository;
import com.projectsem3.rooshapi.repositories.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingManager extends GenericManager<Booking, BookingRepository>{
    @Autowired
    public BookingManager(BookingRepository bookingRepository){
        super._repo = bookingRepository;
    }

}
