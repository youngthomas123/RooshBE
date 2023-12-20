package com.projectsem3.rooshapi.controllers.interfaces;

import com.projectsem3.rooshapi.domain.GenericClass;

import java.util.List;
import java.util.UUID;

public interface Controller<T, T1, T2>{
    public List<T1> getItems();
    public T1 getItemById(UUID id);
    public UUID addItem(T item);
    public Boolean removeItem(UUID id);
    public Boolean updateItem(T2 item);
}
