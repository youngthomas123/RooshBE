package com.projectsem3.rooshapi.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Office implements GenericClass<Office> {
    private UUID id;
    private String phoneNumber;
    private String street;
    private String streetNumber;
    private String zipCode;
    private String city;
    private String country;
    private List<User> users;

    //region Boilerplate
    public Office(){

    }

    public Office(UUID id, String phoneNumber, String street, String streetNumber, String zipCode, String city, String country) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.users = null;
    }

    @Override
    public Boolean update(Office source) {
        this.phoneNumber = source.phoneNumber;
        this.street = source.street;
        this.streetNumber = source.streetNumber;
        this.zipCode = source.zipCode;
        this.city = source.city;
        this.country = source.country;
        this.users = source.users;

        return true;
    }

    @Override
    public Office createNewInstance() {
        this.id = UUID.randomUUID();
        return this;
    }
    //endregion
}
