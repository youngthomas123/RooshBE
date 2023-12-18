package com.projectsem3.rooshapi.mapper;

import com.projectsem3.rooshapi.domain.Office;
import com.projectsem3.rooshapi.domain.Status;
import com.projectsem3.rooshapi.repositories.entity.Booking;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@Component
public class BookingConverter implements GenericConverter<com.projectsem3.rooshapi.domain.Booking, Booking>{
    @Override
    public List<com.projectsem3.rooshapi.domain.Booking> returnDomainList(List<com.projectsem3.rooshapi.repositories.entity.Booking> objects) {
        List<com.projectsem3.rooshapi.domain.Booking> bookings = new ArrayList();
        for(com.projectsem3.rooshapi.repositories.entity.Booking booking : objects){
            bookings.add(returnDomainObject(booking));
        }

        return bookings;
    }

    @Override
    public com.projectsem3.rooshapi.domain.Booking returnDomainObject(com.projectsem3.rooshapi.repositories.entity.Booking object) {
        return new com.projectsem3.rooshapi.domain.Booking(object.getId(), object.getReferenceNumber(), object.getOrderedAt(), object.getDeparture(), object.getVendor(), object.getLanguage(), Status.valueOf(object.getStatus()), object.getPrice());
    }

    @Override
    public com.projectsem3.rooshapi.repositories.entity.Booking returnEntity(com.projectsem3.rooshapi.domain.Booking object) {
        return null;
    }
}
