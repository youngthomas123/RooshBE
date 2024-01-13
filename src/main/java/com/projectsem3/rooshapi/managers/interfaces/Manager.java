package com.projectsem3.rooshapi.managers.interfaces;


import com.projectsem3.rooshapi.domain.GenericClass;

import java.util.List;
import java.util.UUID;

public interface Manager<T extends GenericClass<T>> {
    public List<T> getItems();
    public T getItemById(UUID id);
    public UUID addItem(T item);
    public Boolean removeItem(UUID item);
    public Boolean updateItem(T item);
}
