package com.projectsem3.rooshapi.repositories.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Airport implements GenericEntity{
    @Id
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
}
