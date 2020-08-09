package com.delink.petclinic_material.service;

import java.util.Set;

/**
 * Created by Adewale.Adeleye on 09/08/2020
 */
public interface CrudService<T,ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
