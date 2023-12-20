package com.projectsem3.rooshapi.managers.facade;

import com.projectsem3.rooshapi.controllers.dtos.request.*;
import com.projectsem3.rooshapi.domain.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FacadeHandler {
    @Autowired
    private ProviderManagerFacade providerFacade;
    @Autowired
    private OfficeManagerFacade officeFacade;
    @Autowired
    private BookingManagerFacade bookingFacade;
    @Autowired
    private AirportManagerFacade airportFacade;


    public List<?> getItems(String obj) {
        if(obj.equals("Provider"))
            return providerFacade.getItems();
        if(obj.equals("Office"))
            return officeFacade.getItems();
        if(obj.equals("Booking"))
            return bookingFacade.getItems();
        if(obj.equals("Airport"))
            return airportFacade.getItems();

        return null;
    }

    public Object getItemById(UUID id, String obj) {
        if(obj.equals("Provider"))
            return providerFacade.getItemById(id);
        if(obj.equals("Office"))
            return officeFacade.getItemById(id);
        if(obj.equals("Booking"))
            return bookingFacade.getItemById(id);
        if(obj.equals("Airport"))
            return airportFacade.getItemById(id);

        return null;
    }

    public UUID addItem(Object item, String obj) {
        if(obj.equals("Provider"))
            return providerFacade.addItem((ProviderRequest) item);
        if(obj.equals("Office"))
            return officeFacade.addItem((OfficeRequest) item);
        if(obj.equals("Booking"))
            return bookingFacade.addItem((BookingRequest) item);
        if(obj.equals("Airport"))
            return airportFacade.addItem((AirportRequest) item);

        return null;
    }

    public Boolean removeItem(UUID item, String obj) {
        if(obj.equals("Provider"))
            return providerFacade.removeItem(item);
        if(obj.equals("Office"))
            return officeFacade.removeItem(item);
        if(obj.equals("Booking"))
            return bookingFacade.removeItem(item);
        if(obj.equals("Airport"))
            return airportFacade.removeItem(item);

        return null;
    }

    public Boolean updateItem(Object item, String obj) {
        if(obj.equals("Provider"))
            return providerFacade.updateItem((ProviderUpdateRequest) item);
        if(obj.equals("Office"))
            return officeFacade.updateItem((OfficeUpdateRequest) item);
        if(obj.equals("Booking"))
            return bookingFacade.updateItem((UpdateBookingRequest) item);
        if(obj.equals("Airport"))
            return airportFacade.updateItem((UpdateAirportRequest) item);

        return null;
    }
}
