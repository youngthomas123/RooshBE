package com.projectsem3.rooshapi.repositories;

import com.projectsem3.rooshapi.data.ProviderDataLayer;
import com.projectsem3.rooshapi.domain.Office;
import com.projectsem3.rooshapi.mapper.OfficeConverter;
import com.projectsem3.rooshapi.mapper.ProviderConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class ProviderRepository extends GenericRepository<com.projectsem3.rooshapi.domain.Provider, ProviderDataLayer, com.projectsem3.rooshapi.repositories.entity.Provider, ProviderConverter> {
    @Autowired
    private OfficeConverter officeConverter;

    @Autowired
    public ProviderRepository(ProviderDataLayer providerDataLayer, ProviderConverter providerConverter){
        super.dataLayer = providerDataLayer;
        super.converter = providerConverter;
    }

    public List<Office> getOfficesByProviderId(UUID id){
        return officeConverter.returnDomainList(super.dataLayer.findOfficesByProvider(id));
    }

    public Boolean addOfficeToProvider(UUID providerId, UUID officeId){
        try {
            super.dataLayer.addOfficeToProvider(providerId, officeId);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
}
