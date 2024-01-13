package com.projectsem3.rooshapi.managers;

import com.projectsem3.rooshapi.controllers.dtos.request.AirportRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.OfficeRequest;
import com.projectsem3.rooshapi.domain.Airport;
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
    @Autowired
    private OfficeManager officeManager;
    @Autowired
    private AirportManager airportManager;

    public List<Office> getOfficesByProviderId(UUID id){
        return super._repo.getOfficesByProviderId(id);
    }

    public Boolean addOfficeToProvider(UUID providerId, OfficeRequest item){
        try {
            Office office = new Office(item.getPhoneNumber(), item.getStreet(), item.getStreetNumber(), item.getZipCode(), item.getCity(), item.getCountry());

            officeManager.addItem(office);
            super._repo.addOfficeToProvider(providerId, office.getId());
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }

    public List<Airport> getAirportsByProviderId(UUID id){
        return super._repo.getAirportsByProviderId(id);
    }

    public Boolean addAirportToProvider(UUID providerId, AirportRequest item){
        try {
            Airport airport = new Airport(item.getName(), item.getCode(), item.getStreetname(), item.getStreetnumber(), item.getZipCode(), item.getCity(), item.getCountry(), item.getLongtitude(), item.getLatitude(), item.getTerminal());

            airportManager.addItem(airport);
            super._repo.addAirportToProvider(providerId, airport.getId());
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
}
