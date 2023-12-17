package com.projectsem3.rooshapi.controllers.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OfficeUpdateRequest {
    private UUID id;
    private String phoneNumber;
    private String street;
    private String streetNumber;
    private String zipCode;
    private String city;
    private String country;
}
