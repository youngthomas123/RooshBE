package com.projectsem3.rooshapi.controllers.dtos.request;

import lombok.Data;

import java.util.UUID;
@Data
public class UpdateAirportRequest {
    private UUID id;
    private String name;
    private String code;
    private String streetname;
    private int streetnumber;
    private String zipCode;
    private String city;
    private String country;
    private Integer longtitude;
    private Integer latitude;
    private Integer terminal;
}
