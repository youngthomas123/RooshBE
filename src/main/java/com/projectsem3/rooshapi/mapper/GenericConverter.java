package com.projectsem3.rooshapi.mapper;

import com.projectsem3.rooshapi.domain.GenericClass;
import com.projectsem3.rooshapi.repositories.entity.GenericEntity;

import java.util.List;

public interface GenericConverter<T extends GenericClass<T>, E extends GenericEntity>{
    public List<T> returnDomainList(List<E> objects);
    public T returnDomainObject(E object);
    public E returnEntity(T object);
}
