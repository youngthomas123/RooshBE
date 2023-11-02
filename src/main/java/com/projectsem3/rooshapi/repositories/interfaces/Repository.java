package com.projectsem3.rooshapi.repositories.interfaces;

import java.util.List;
import java.util.UUID;

public interface Repository<T>{
    public List<T> getItems();
    public T getItemById(UUID id);
    public Boolean addItem(T item);
    public Boolean removeItem(T item);
    public Boolean updateItem(T item);
}
