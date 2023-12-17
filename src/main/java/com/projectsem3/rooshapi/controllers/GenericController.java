package com.projectsem3.rooshapi.controllers;

import com.projectsem3.rooshapi.controllers.interfaces.Controller;
import com.projectsem3.rooshapi.domain.GenericClass;
import com.projectsem3.rooshapi.managers.GenericManager;
import com.projectsem3.rooshapi.managers.facade.FacadeHandler;
import com.projectsem3.rooshapi.util.ApplicationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

//todo fix create and delete

@RestController
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
public abstract class GenericController<T, T1, T2> implements Controller<T, T1, T2> {
    protected Logger logger = ApplicationLogger.GetLogger();

    @Autowired
    protected FacadeHandler facadeHandler;

    protected String classType = null;


    @Override
    @GetMapping(value = "")
    public List<T1> getItems() {
        List<T1> response = (List<T1>) facadeHandler.getItems(classType);
        if(response != null){
            logger.info(MessageFormat.format("A total of {0} items were found.", response.size()));
            return response;
        }
        logger.warning("No item was found");

        return response;
    }

    @Override
    @GetMapping(value = "/{id}")
    public T1 getItemById(@PathVariable UUID id) {
        T1 item = (T1) facadeHandler.getItemById(id, classType);
        if(item != null){
            logger.info(MessageFormat.format("Item with id {0} was found", id));
            return item;
        }
        logger.warning("No item was found");

        return item;
    }

    @Override
    @PostMapping(value = "")
    public Boolean addItem(@RequestBody T item) {
        try{
            facadeHandler.addItem(item, classType);
            logger.info("Item was successfully added");
            return true;
        }
        catch (Exception ex){
            logger.info(MessageFormat.format("An error has occurred with the message {0}", ex.getMessage()));
            return false;
        }
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public Boolean removeItem(@PathVariable UUID id) {
        try{
            facadeHandler.removeItem(id, classType);
            logger.info(MessageFormat.format("Item with id {0} was successfully removed", id));
            return true;
        }
        catch (Exception ex){
            logger.info(MessageFormat.format("An error has occurred with the message {0}", ex.getMessage()));
            return false;
        }
    }

    @Override
    @PutMapping(value = "")
    public Boolean updateItem(@RequestBody T2 item) {
        try{
            facadeHandler.updateItem(item, classType);
            logger.info("Item was successfully updated");
            return true;
        }
        catch (Exception ex){
            logger.info(MessageFormat.format("An error has occurred with the message {0}", ex.getMessage()));
            return false;
        }
    }
}
