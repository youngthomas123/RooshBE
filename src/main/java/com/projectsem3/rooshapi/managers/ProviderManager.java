package com.projectsem3.rooshapi.managers;

import com.projectsem3.rooshapi.domain.Provider;
import com.projectsem3.rooshapi.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderManager extends GenericManager<Provider, ProviderRepository>{
    @Autowired
    public ProviderManager(ProviderRepository providerRepository){
        super._repo = providerRepository;
    }
}
