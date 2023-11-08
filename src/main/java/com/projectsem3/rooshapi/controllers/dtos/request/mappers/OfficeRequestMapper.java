package com.projectsem3.rooshapi.controllers.dtos.request.mappers;

import com.projectsem3.rooshapi.controllers.dtos.request.OfficeRequest;
import com.projectsem3.rooshapi.domain.Office;

public class OfficeRequestMapper {
    public static Office officeRequestToOffice(OfficeRequest officeRequest){
        return new Office();
    }
}
