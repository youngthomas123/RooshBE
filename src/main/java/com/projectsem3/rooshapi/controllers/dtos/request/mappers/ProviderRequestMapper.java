package com.projectsem3.rooshapi.controllers.dtos.request.mappers;

import com.projectsem3.rooshapi.controllers.dtos.request.ProviderRequest;
import com.projectsem3.rooshapi.domain.Provider;
import com.projectsem3.rooshapi.repositories.ProviderRepository;

public class ProviderRequestMapper {
    public static Provider providerRequestToProvider(ProviderRequest providerRequest){
        return new Provider(providerRequest.getName(), providerRequest.getLogo());
    }
}
