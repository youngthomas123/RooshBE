package com.projectsem3.rooshapi.repositories;

import com.projectsem3.rooshapi.data.GenericDatalayer;
import com.projectsem3.rooshapi.domain.GenericClass;
import com.projectsem3.rooshapi.mapper.GenericConverter;
import com.projectsem3.rooshapi.repositories.entity.GenericEntity;
import com.projectsem3.rooshapi.repositories.interfaces.Repository;
import com.projectsem3.rooshapi.util.ApplicationLogger;
import org.springframework.transaction.annotation.Transactional;

import java.text.MessageFormat;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

public abstract class GenericRepository<T extends GenericClass<T>, T1 extends GenericDatalayer<E>, E extends GenericEntity, C extends GenericConverter<T, E>> implements Repository<T> {
    protected T1 dataLayer;
    protected Logger logger = ApplicationLogger.GetLogger();
    protected C converter;

    protected GenericRepository() {
        dataLayer = null;
    }

    @Override
    public List<T> getItems() {
        List<T> items = converter.returnDomainList(dataLayer.findAll());
        if(items != null){
            logger.info(MessageFormat.format("A total of {0} items were found.", items.size()));
            return items;
        }
        logger.warning("No item was found");
        return items;
    }

    @Override
    public T getItemById(UUID id) {
        T item = converter.returnDomainObject(dataLayer.findById(id).orElseThrow());
        if(item != null){
            logger.info(MessageFormat.format("Item with id {0} was found", item.getId()));
            return item;
        }
        logger.warning("No item was found");
        return item;
    }

    @Transactional
    @Override
    public Boolean addItem(T item) {
        try{
            dataLayer.save(converter.returnEntity(item));
            logger.info(MessageFormat.format("Item with id {0} was successfully saved", item.getId()));

            return true;
        }
        catch (Exception ex){
            logger.severe("An error has occurred: " + ex.getMessage());
            return false;
        }
    }

    @Transactional
    @Override
    public Boolean removeItem(T item) {
        try{
            dataLayer.deleteById(item.getId());
            logger.info(MessageFormat.format("Item with id {0} was successfully deleted", item.getId()));

            return true;
        }
        catch (Exception ex){
            logger.severe("An error has occurred: " + ex.getMessage());
            return false;
        }
    }

    @Transactional
    @Override
    public Boolean updateItem(T item) {
        try{
            T dbDomain = getItemById(item.getId());
            dbDomain.update(item);
            dataLayer.save(converter.returnEntity(dbDomain));
            logger.info(MessageFormat.format("Item with id {0} was successfully updated", item.getId()));

            return true;
        }
        catch (Exception ex){
            logger.severe("An error has occurred: " + ex.getMessage());
            return false;
        }
    }
}
