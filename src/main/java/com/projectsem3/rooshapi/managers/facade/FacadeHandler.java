package com.projectsem3.rooshapi.managers.facade;

import com.projectsem3.rooshapi.domain.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FacadeHandler {
    @Autowired
    private ProviderManagerFacade providerFacade;
    public List<?> getItems(String obj) {
        if(obj.equals("Provider"))
            return providerFacade.getItems();

        return null;
    }

    public Object getItemById(UUID id, String obj) {
        if(obj.equals("Provider"))
            return providerFacade.getItemById(id);

        return null;
    }

    public Boolean addItem(Object item, String obj) {
        if(obj.equals("Provider"))
            return providerFacade.addItem((Provider) item);

        return null;
    }

    public Boolean removeItem(UUID item, String obj) {
        if(obj.equals("Provider"))
            return providerFacade.removeItem(item);

        return null;
    }

    public Boolean updateItem(Object item, String obj) {
        if(obj.equals("Provider"))
            return providerFacade.updateItem((Provider) item);

        return null;
    }
}
