package com.projectsem3.rooshapi.managers;

import com.projectsem3.rooshapi.domain.GenericClass;
import com.projectsem3.rooshapi.managers.interfaces.Manager;
import com.projectsem3.rooshapi.repositories.GenericRepository;
import com.projectsem3.rooshapi.util.ApplicationLogger;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.MessageFormat;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

@SuppressWarnings("rawtypes")
public abstract class GenericManager<T extends GenericClass<T>, T1 extends GenericRepository> implements Manager<T> {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    protected T1 _repo;

    protected Logger logger = ApplicationLogger.GetLogger();

    @Override

    public List<T> getItems() {
        List items = _repo.getItems();
        if(items != null){
            logger.info(MessageFormat.format("A total of {0} items were found.", items.size()));
            return items;
        }
        logger.warning("No item was found");
        return items;
    }

    @Override
    public T getItemById(UUID id) {
        T item = (T) _repo.getItemById(id);
        if(item != null){
            logger.info(MessageFormat.format("Item with id {0} was found", item.getId()));
            return item;
        }
        logger.warning("No item was found");
        return item;
    }

    @Override
    public Boolean addItem(T item) {
        try{
            _repo.addItem(item);
            logger.info(MessageFormat.format("Item with id {0} was successfully added", item.getId()));
            return true;
        }
        catch (Exception ex){
            logger.severe("there was an issue adding item with id " + item.getId() + " with name " + ex.getMessage());
            return false;
        }
    }

    @Override
    public Boolean removeItem(UUID item) {
        try{
            _repo.removeItem(getItemById(item));
            logger.info(MessageFormat.format("Item with id {0} was successfully deleted", item));
            return true;
        }
        catch (Exception ex){
            logger.severe("there was an issue removing item with id " + item + " with name " + ex.getMessage());
            return false;
        }
    }

    @Override
    public Boolean updateItem(T item) {
        try{
            _repo.updateItem(item);
            logger.info(MessageFormat.format("Item with id {0} was successfully updated", item.getId()));
            return true;
        }
        catch (Exception ex){
            logger.severe("there was an issue updating item with id " + item.getId() + " with name " + ex.getMessage());
            return false;
        }
    }
}
