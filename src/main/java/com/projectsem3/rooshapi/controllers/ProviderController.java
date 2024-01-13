package com.projectsem3.rooshapi.controllers;

import com.projectsem3.rooshapi.controllers.dtos.request.ProviderRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.ProviderUpdateRequest;
import com.projectsem3.rooshapi.domain.Airport;
import com.projectsem3.rooshapi.domain.Office;
import com.projectsem3.rooshapi.domain.Provider;
import com.projectsem3.rooshapi.managers.ProviderManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("providers")
public class ProviderController extends GenericController<ProviderRequest, Provider, ProviderUpdateRequest>{
    @Autowired
    private ProviderManager _manager;

    public ProviderController(){
        super.classType = "Provider";
    }

    @GetMapping(value = "/{id}/offices")
    public List<Office> getOfficesByProviderId(@PathVariable UUID id){
        return _manager.getOfficesByProviderId(id);
    }

    @PostMapping(value = "/{providerId}/offices/add/{officeId}")
    public Boolean addOfficeToProvider(@PathVariable UUID providerId, @PathVariable UUID officeId){
        try {
            _manager.addOfficeToProvider(providerId, officeId);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }

    @GetMapping(value = "/{id}/airports")
    public List<Airport> getAirportsByProviderId(@PathVariable UUID id){
        return _manager.getAirportsByProviderId(id);
    }

    @PostMapping(value = "/{providerId}/airports/add/{airportId}")
    public Boolean addAirportsToProvider(@PathVariable UUID providerId, @PathVariable UUID airportId){
        try {
            _manager.addAirportToProvider(providerId, airportId);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
}
