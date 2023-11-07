package com.projectsem3.rooshapi.repositories.entity;

import com.projectsem3.rooshapi.repositories.entity.Office;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter @Setter @Entity
public class Provider implements GenericEntity{
    @Id
    private UUID id;
    private String name;
    private String logo;
    @OneToMany
    private List<Office> offices;

    public Provider(UUID id, String name, String logo, List<Office> offices) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.offices = offices;
    }

    public Provider() {

    }
}
