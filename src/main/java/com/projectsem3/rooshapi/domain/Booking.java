package com.projectsem3.rooshapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking implements GenericClass<Booking>{
        private UUID id;
        private String referenceNumber;
        private LocalDateTime orderedAt;
        private LocalDate departure;
        private User user;
        private String vendor;
        private String language;
        private Status status;
        private Float price;

    public Booking(UUID id, String referenceNumber, LocalDateTime orderedAt, LocalDate departure, String vendor, String language, Status status, Float price) {
        this.id = id;
        this.referenceNumber = referenceNumber;
        this.orderedAt = orderedAt;
        this.departure = departure;
        this.user = null;
        this.vendor = vendor;
        this.language = language;
        this.status = status;
        this.price = price;
    }
    public Booking( String referenceNumber, LocalDateTime orderedAt, LocalDate departure, String vendor, String language, Status status, Float price) {
        this.id = UUID.randomUUID();
        this.referenceNumber = referenceNumber;
        this.orderedAt = orderedAt;
        this.departure = departure;
        this.user = null;
        this.vendor = vendor;
        this.language = language;
        this.status = status;
        this.price = price;
    }

    @Override
    public Boolean update(Booking source) {
        this.referenceNumber = source.getReferenceNumber();
        this.orderedAt = source.getOrderedAt();
        this.departure = source.getDeparture();
        this.user = source.getUser();
        this.vendor = source.getVendor();
        this.language = source.getLanguage();
        this.status = source.getStatus();
        this.price = source.getPrice();

        return true;
    }
    @Override
    public Booking createNewInstance() {
        this.id = UUID.randomUUID();
        return this;
    }

}
