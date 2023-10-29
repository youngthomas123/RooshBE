package com.projectsem3.rooshapi.domain;

import java.util.UUID;

public interface GenericClass<T>{
    public Boolean update(T source);
    public UUID getId();
    public T createNewInstance();
}