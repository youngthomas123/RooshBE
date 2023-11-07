package com.projectsem3.rooshapi.repositories.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity @Getter @Setter
public class User implements GenericEntity {
    @Id
    UUID id;
}
