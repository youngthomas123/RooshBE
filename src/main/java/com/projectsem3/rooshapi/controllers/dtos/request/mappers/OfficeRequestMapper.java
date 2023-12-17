package com.projectsem3.rooshapi.controllers.dtos.request.mappers;

import com.projectsem3.rooshapi.controllers.dtos.request.OfficeRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.OfficeUpdateRequest;
import com.projectsem3.rooshapi.domain.Office;

public class OfficeRequestMapper {
    public static Office officeRequestToOffice(OfficeRequest officeRequest){
        return new Office(officeRequest.getPhoneNumber(), officeRequest.getStreet(), officeRequest.getStreetNumber(), officeRequest.getZipCode(), officeRequest.getCity(), officeRequest.getCountry());
    }

    public static Office officeUpdateRequestToOffice(OfficeUpdateRequest officeRequest){
        return new Office(officeRequest.getId(), officeRequest.getPhoneNumber(), officeRequest.getStreet(), officeRequest.getStreetNumber(), officeRequest.getZipCode(), officeRequest.getCity(), officeRequest.getCountry());

    }
}
