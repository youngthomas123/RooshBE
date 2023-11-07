package com.projectsem3.rooshapi.controllers;

import com.projectsem3.rooshapi.domain.Provider;
import com.projectsem3.rooshapi.managers.ProviderManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin(origins = "http://localhost:3000/", maxAge = 3600)
@RestController
@RequestMapping("providers")
public class ProviderController extends GenericController<Provider, Provider, ProviderManager>{
    @Autowired
    private ProviderManager _manager;

    @Autowired
    public ProviderController(ProviderManager providerManager){
        super._manager = providerManager;
        super.classType = "Provider";
    }

    @GetMapping(value = "add/{providername}")
    public Boolean addUser(@PathVariable String providername) {
        try{
            _manager.addItem(new Provider(UUID.randomUUID(), providername, null, null));
            return true;
        }
        catch (Exception ex){
            System.out.println("An error has occurred: " + ex.getMessage());
            return false;
        }
    }
}
