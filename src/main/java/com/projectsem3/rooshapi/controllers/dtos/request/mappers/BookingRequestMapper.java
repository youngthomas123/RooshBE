package com.projectsem3.rooshapi.controllers.dtos.request.mappers;

import com.projectsem3.rooshapi.controllers.dtos.request.BookingRequest;
import com.projectsem3.rooshapi.domain.Booking;

public class BookingRequestMapper {
    public static Booking bookingRequestToBooking(BookingRequest bookingRequest){
        return new Booking(bookingRequest.getReferenceNumber(), bookingRequest.getOrderedAt(), bookingRequest.getDeparture(), bookingRequest.getVendor(), bookingRequest.getLanguage(), bookingRequest.getStatus(), bookingRequest.getPrice());
    }
}
