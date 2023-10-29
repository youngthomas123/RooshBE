package com.projectsem3.rooshapi.managers.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FacadeHandler {
    @Autowired
    private UserManagerFacade userFacade;
    public List<?> getItems(String obj) {
//        if(obj.equals("User"))
//            return (List<UserResponse>) userFacade.getItems();

        return null;
    }

    public Object getItemById(UUID id, String obj) {
//        if(obj.equals("User"))
//            return userFacade.getItemById(id);

        return null;
    }

    public Boolean addItem(Object item, String obj) {
//        if(obj.equals("User"))
//            return userFacade.addItem((UserCreationRequest) item);

        return null;
    }

    public Boolean removeItem(UUID item, String obj) {
//        if(obj.equals("User"))
//            return userFacade.removeItem(item);

        return null;
    }

    public Boolean updateItem(Object item, String obj) {
//        if(obj.equals("User"))
//            return userFacade.updateItem((UserUpdateRequest) item);

        return null;
    }
}
