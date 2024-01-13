package com.projectsem3.rooshapi.managers.facade;

import com.projectsem3.rooshapi.controllers.dtos.request.ProviderRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.ProviderUpdateRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.mappers.ProviderRequestMapper;
import com.projectsem3.rooshapi.domain.Provider;
import com.projectsem3.rooshapi.managers.ProviderManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProviderManagerFacade {
    @Autowired
    private ProviderManager _manager;

    public List<Provider> getItems() {
        List<Provider> providers = _manager.getItems();

        for(Provider provider : providers){
            provider.setOffices(_manager.getOfficesByProviderId(provider.getId()));
            provider.setAirports(_manager.getAirportsByProviderId(provider.getId()));
        }

        return providers;
    }

    public Provider getItemById(UUID id) {
        return _manager.getItemById(id);
    }

    public UUID addItem(ProviderRequest item) {
        return _manager.addItem(ProviderRequestMapper.providerRequestToProvider(item));
    }

    public Boolean removeItem(UUID item) {
        return _manager.removeItem(item);
    }

    public Boolean updateItem(ProviderUpdateRequest item) {
        return _manager.updateItem(ProviderRequestMapper.providerUpdateRequestToProvider(item));
    }
}
