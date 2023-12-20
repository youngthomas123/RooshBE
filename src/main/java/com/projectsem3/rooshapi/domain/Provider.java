package com.projectsem3.rooshapi.domain;

import com.projectsem3.rooshapi.data.ProviderDataLayer;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter @Setter
public class Provider implements GenericClass<Provider> {
    private UUID id;
    private String name;
    private String logo;
    private List<Office> offices;

    // region Boilerplate
    public Provider(){

    }
    public Provider(UUID id){
        this.id = id;
    }

    public Provider(String name, String logo){
        this.id = UUID.randomUUID();
        this.name = name;
        this.logo = logo;
        this.offices = null;
    }

    public Provider(UUID id, String name, String logo){
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.offices = null;
    }

    public Provider(UUID id, String name, String logo, List<Office> offices){
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.offices = offices;
    }

    @Override
    public Boolean update(Provider source) {
        this.name = source.getName();
        this.logo = source.getLogo();

        return true;
    }

    @Override
    public Provider createNewInstance() {
        this.id = UUID.randomUUID();
        return this;
    }
    // endregion
}
