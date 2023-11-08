package com.projectsem3.rooshapi.managers;

import com.projectsem3.rooshapi.domain.Office;
import com.projectsem3.rooshapi.domain.Provider;
import com.projectsem3.rooshapi.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProviderManager extends GenericManager<Provider, ProviderRepository>{
    @Autowired
    public ProviderManager(ProviderRepository providerRepository){
        super._repo = providerRepository;
    }

    public List<Office> getOfficesByProviderId(UUID id){
        return super._repo.getOfficesByProviderId(id);
    }

    public Boolean addOfficeToProvider(UUID providerId, UUID officeId){
        try {
            super._repo.addOfficeToProvider(providerId, officeId);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
}
