package com.projectsem3.rooshapi.mapper;

import com.projectsem3.rooshapi.domain.Office;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OfficeConverter implements GenericConverter<Office, com.projectsem3.rooshapi.repositories.entity.Office>{
    @Override
    public List<Office> returnDomainList(List<com.projectsem3.rooshapi.repositories.entity.Office> objects) {
        List<Office> offices = new ArrayList();
        for(com.projectsem3.rooshapi.repositories.entity.Office office : objects){
            offices.add(returnDomainObject(office));
        }

        return offices;
    }

    @Override
    public Office returnDomainObject(com.projectsem3.rooshapi.repositories.entity.Office object) {
        return new Office(object.getId(), object.getPhoneNumber(), object.getStreet(), object.getStreetNumber(), object.getZipCode(), object.getCity(), object.getCountry());
    }

    @Override
    public com.projectsem3.rooshapi.repositories.entity.Office returnEntity(Office object) {
        return null;
    }
}
