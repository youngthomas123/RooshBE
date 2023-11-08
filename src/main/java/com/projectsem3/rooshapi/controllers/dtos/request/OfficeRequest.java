package com.projectsem3.rooshapi.controllers.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OfficeRequest {
    private String phoneNumber;
    private String street;
    private String streetNumber;
    private String zipCode;
    private String city;
    private String country;
}
