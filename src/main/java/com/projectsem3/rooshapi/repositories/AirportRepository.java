package com.projectsem3.rooshapi.repositories;

import com.projectsem3.rooshapi.data.AirportDataLayer;
import com.projectsem3.rooshapi.domain.Airport;
import com.projectsem3.rooshapi.mapper.AirportConverter;
import org.springframework.stereotype.Repository;

@Repository
public class AirportRepository extends GenericRepository<Airport, AirportDataLayer, com.projectsem3.rooshapi.repositories.entity.Airport, AirportConverter>{
    public AirportRepository(AirportDataLayer airportDataLayer, AirportConverter airportConverter){
        super.dataLayer = airportDataLayer;
        super.converter = airportConverter;
    }
}
