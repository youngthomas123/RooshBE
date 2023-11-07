package com.projectsem3.rooshapi.repositories;

import com.projectsem3.rooshapi.data.ProviderDataLayer;
import com.projectsem3.rooshapi.mapper.ProviderConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProviderRepository extends GenericRepository<com.projectsem3.rooshapi.domain.Provider, ProviderDataLayer, com.projectsem3.rooshapi.repositories.entity.Provider, ProviderConverter> {
    private ProviderDataLayer providerDataLayer;
    private ProviderConverter providerConverter;


    @Autowired
    public ProviderRepository(ProviderDataLayer providerDataLayer, ProviderConverter providerConverter){
        this.providerDataLayer = providerDataLayer;
        this.providerConverter = providerConverter;
        super.dataLayer = this.providerDataLayer;
        super.converter = providerConverter;
    }
}
