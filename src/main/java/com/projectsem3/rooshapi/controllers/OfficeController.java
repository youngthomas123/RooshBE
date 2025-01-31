package com.projectsem3.rooshapi.controllers;

import com.projectsem3.rooshapi.controllers.dtos.request.OfficeRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.OfficeUpdateRequest;
import com.projectsem3.rooshapi.managers.OfficeManager;
import com.projectsem3.rooshapi.managers.ProviderManager;
import com.projectsem3.rooshapi.repositories.entity.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("offices")
public class OfficeController extends GenericController<OfficeRequest, Office, OfficeUpdateRequest>{
    @Autowired
    private OfficeManager _manager;

    public OfficeController(){
        super.classType = "Office";
    }
}
