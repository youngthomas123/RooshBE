package com.projectsem3.rooshapi.managers;

import com.projectsem3.rooshapi.domain.Airport;
import com.projectsem3.rooshapi.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.UUID;

@Service
public class AirportManager extends GenericManager<Airport, AirportRepository>{
    @Autowired
    public AirportManager(AirportRepository airportRepository){
        super._repo = airportRepository;
    }

    @Override
    public UUID addItem(Airport item) {
        try{
            super._repo.addItem(item);
            logger.info(MessageFormat.format("Item with id {0} was successfully added", item.getId()));
            return item.getId();
        }
        catch (Exception ex){
            logger.severe("there was an issue adding item with id " + item.getId() + " with name " + ex.getMessage());
            return null;
        }
    }

}
