package com.projectsem3.rooshapi.managers.facade;

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
        return _manager.getItems();
    }

    public Provider getItemById(UUID id) {
        return _manager.getItemById(id);
    }

    public Boolean addItem(Provider item) {
        return _manager.addItem(item);
    }

    public Boolean removeItem(UUID item) {
        return _manager.removeItem(item);
    }

    public Boolean updateItem(Provider item) {
        return _manager.updateItem(item);
    }
}
