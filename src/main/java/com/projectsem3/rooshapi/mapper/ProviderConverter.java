package com.projectsem3.rooshapi.mapper;

import com.projectsem3.rooshapi.data.ProviderDataLayer;
import com.projectsem3.rooshapi.domain.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProviderConverter implements GenericConverter<Provider, com.projectsem3.rooshapi.repositories.entity.Provider>{

    @Autowired
    private OfficeConverter officeConverter;

    @Override
    public List<Provider> returnDomainList(List<com.projectsem3.rooshapi.repositories.entity.Provider> objects) {
        List<Provider> providers = new ArrayList();
        for(com.projectsem3.rooshapi.repositories.entity.Provider provider : objects){
            providers.add(returnDomainObject(provider));
        }

        return providers;
    }

    @Override
    public Provider returnDomainObject(com.projectsem3.rooshapi.repositories.entity.Provider object) {
        return new Provider(object.getId(), object.getName(), object.getLogo(), officeConverter.returnDomainList(object.getOffices()));
    }

    @Override
    public com.projectsem3.rooshapi.repositories.entity.Provider returnEntity(Provider object) {
        return new com.projectsem3.rooshapi.repositories.entity.Provider(object.getId(), object.getName(), object.getLogo(), null);
    }
}
