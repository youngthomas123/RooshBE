package com.projectsem3.rooshapi.managers.facade;

import com.projectsem3.rooshapi.controllers.dtos.request.OfficeRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.ProviderRequest;
import com.projectsem3.rooshapi.domain.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FacadeHandler {
    @Autowired
    private ProviderManagerFacade providerFacade;
    @Autowired
    private OfficeManagerFacade officeFacade;


    public List<?> getItems(String obj) {
        if(obj.equals("Provider"))
            return providerFacade.getItems();
        if(obj.equals("Office"))
            return officeFacade.getItems();

        return null;
    }

    public Object getItemById(UUID id, String obj) {
        if(obj.equals("Provider"))
            return providerFacade.getItemById(id);
        if(obj.equals("Office"))
            return officeFacade.getItemById(id);

        return null;
    }

    public Boolean addItem(Object item, String obj) {
        if(obj.equals("Provider"))
            return providerFacade.addItem((ProviderRequest) item);
        if(obj.equals("Office"))
            return officeFacade.addItem((OfficeRequest) item);

        return null;
    }

    public Boolean removeItem(UUID item, String obj) {
        if(obj.equals("Provider"))
            return providerFacade.removeItem(item);
        if(obj.equals("Office"))
            return officeFacade.removeItem(item);

        return null;
    }

    public Boolean updateItem(Object item, String obj) {
        if(obj.equals("Provider"))
            return providerFacade.updateItem((ProviderRequest) item);
        if(obj.equals("Office"))
            return officeFacade.updateItem((OfficeRequest) item);

        return null;
    }
}
