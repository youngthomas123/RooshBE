package com.projectsem3.rooshapi.repositories;

import com.projectsem3.rooshapi.data.BookingDataLayer;
import com.projectsem3.rooshapi.domain.Booking;
import com.projectsem3.rooshapi.mapper.BookingConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookingRepository extends GenericRepository<Booking, BookingDataLayer, com.projectsem3.rooshapi.repositories.entity.Booking, BookingConverter> {
    @Autowired
    public BookingRepository(BookingDataLayer bookingDataLayer, BookingConverter bookingConverter){
        super.dataLayer = bookingDataLayer;
        super.converter = bookingConverter;
    }
}
