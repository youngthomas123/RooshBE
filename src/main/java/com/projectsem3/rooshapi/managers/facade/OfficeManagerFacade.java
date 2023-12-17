package com.projectsem3.rooshapi.managers.facade;

import com.projectsem3.rooshapi.controllers.dtos.request.OfficeRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.OfficeUpdateRequest;
import com.projectsem3.rooshapi.controllers.dtos.request.mappers.OfficeRequestMapper;
import com.projectsem3.rooshapi.domain.Office;
import com.projectsem3.rooshapi.managers.OfficeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OfficeManagerFacade {
    @Autowired
    private OfficeManager _manager;

    public List<Office> getItems() {
        return _manager.getItems();
    }

    public Office getItemById(UUID id) {
        return _manager.getItemById(id);
    }

    public Boolean addItem(OfficeRequest item) {
        return _manager.addItem(OfficeRequestMapper.officeRequestToOffice(item));
    }

    public Boolean removeItem(UUID item) {
        return _manager.removeItem(item);
    }

    public Boolean updateItem(OfficeUpdateRequest item) {
        return _manager.updateItem(OfficeRequestMapper.officeUpdateRequestToOffice(item));
    }
}
