package com.projectsem3.rooshapi.repositories;

import com.projectsem3.rooshapi.data.OfficeDataLayer;
import com.projectsem3.rooshapi.data.ProviderDataLayer;
import com.projectsem3.rooshapi.domain.Office;
import com.projectsem3.rooshapi.mapper.OfficeConverter;
import com.projectsem3.rooshapi.mapper.ProviderConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OfficeRepository extends GenericRepository<Office, OfficeDataLayer, com.projectsem3.rooshapi.repositories.entity.Office, OfficeConverter>{
    private OfficeDataLayer officeDataLayer;
    private OfficeConverter officeConverter;

    @Autowired
    public OfficeRepository(OfficeDataLayer officeDataLayer, OfficeConverter officeConverter){
        this.officeDataLayer = officeDataLayer;
        this.officeConverter = officeConverter;
        super.dataLayer = this.officeDataLayer;
        super.converter = officeConverter;
    }
}
