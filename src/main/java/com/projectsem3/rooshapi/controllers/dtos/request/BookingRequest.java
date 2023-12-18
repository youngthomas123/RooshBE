package com.projectsem3.rooshapi.controllers.dtos.request;

import com.projectsem3.rooshapi.domain.Status;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class BookingRequest {
    private String referenceNumber;
    private LocalDateTime orderedAt;
    private LocalDate departure;
    private String vendor;
    private String language;
    private Status status;
    private Float price;
}
