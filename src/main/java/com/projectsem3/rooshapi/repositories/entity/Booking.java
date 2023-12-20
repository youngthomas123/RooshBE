package com.projectsem3.rooshapi.repositories.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking implements GenericEntity{
    @Id
    private UUID id;
    @Column(name = "reference_number")
    private String referenceNumber;
    private LocalDateTime orderedAt;
    private LocalDate departure;
    private String vendor;
    private String language;
    private String status;
    private Float price;
}
