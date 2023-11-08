package com.projectsem3.rooshapi.repositories.entity;

import com.projectsem3.rooshapi.repositories.entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter @Setter @Entity
public class Office implements GenericEntity{
    @Id
    private UUID id;
    private String phoneNumber;
    private String street;
    private String streetNumber;
    private String zipCode;
    private String city;
    private String country;
    @OneToMany
    private List<User> users;

    public Office(UUID id, String phoneNumber, String street, String streetNumber, String zipCode, String city, String country, List<User> users) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.users = users;
    }
}
