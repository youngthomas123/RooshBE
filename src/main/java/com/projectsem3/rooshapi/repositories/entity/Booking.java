package com.projectsem3.rooshapi.repositories.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    private String referenceNumber;
    private LocalDateTime orderedAt;
    private LocalDate departure;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String vendor;
    private String language;
    private String status;
    private Float price;
}
