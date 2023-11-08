package com.projectsem3.rooshapi.controllers;

import com.projectsem3.rooshapi.controllers.dtos.request.ProviderRequest;
import com.projectsem3.rooshapi.domain.Provider;
import com.projectsem3.rooshapi.managers.ProviderManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("providers")
public class ProviderController extends GenericController<ProviderRequest, Provider, ProviderManager>{
    @Autowired
    private ProviderManager _manager;

    @Autowired
    public ProviderController(ProviderManager providerManager){
        super._manager = providerManager;
        super.classType = "Provider";
    }
}
