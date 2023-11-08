package com.projectsem3.rooshapi.managers;

import com.projectsem3.rooshapi.domain.Office;
import com.projectsem3.rooshapi.repositories.GenericRepository;
import com.projectsem3.rooshapi.repositories.OfficeRepository;
import com.projectsem3.rooshapi.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OfficeManager extends GenericManager<Office, OfficeRepository> {
    @Autowired
    public OfficeManager(OfficeRepository officeRepository){
        super._repo = officeRepository;
    }
}
