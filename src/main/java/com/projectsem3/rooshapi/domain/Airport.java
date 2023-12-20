package com.projectsem3.rooshapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Airport implements GenericClass<Airport>{
    private UUID id;
    private String name;
    private Provider provider;
    private String code;
    private String streetname;
    private int streetnumber;
    private String zipCode;
    private String city;
    private String country;
    private Integer longtitude;
    private Integer latitude;

    public Airport(UUID id, String name, String code, String streetname, int streetnumber, String zipCode, String city, String country, Integer longtitude, Integer latitude) {
        this.id = id;
        this.name = name;
        this.provider = null;
        this.code = code;
        this.streetname = streetname;
        this.streetnumber = streetnumber;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.longtitude = longtitude;
        this.latitude = latitude;
    }
    public Airport(String name,Provider provider, String code, String streetname, int streetnumber, String zipCode, String city, String country, Integer longtitude, Integer latitude) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.provider = provider;
        this.code = code;
        this.streetname = streetname;
        this.streetnumber = streetnumber;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.longtitude = longtitude;
        this.latitude = latitude;
    }
    @Override
    public Boolean update(Airport source) {
        this.name = source.getName();
        this.provider = source.getProvider();
        this.code = source.getCode();
        this.streetname = source.getStreetname();
        this.streetnumber = source.getStreetnumber();
        this.zipCode = source.getZipCode();
        this.city = source.getCity();
        this.country = source.getCountry();
        this.longtitude = source.getLongtitude();
        this.latitude = source.getLatitude();

        return true;
    }
    @Override
    public Airport createNewInstance() {
        this.id = UUID.randomUUID();
        return this;
    }

}
