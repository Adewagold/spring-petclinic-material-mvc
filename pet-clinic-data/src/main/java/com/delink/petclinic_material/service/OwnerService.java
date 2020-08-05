package com.delink.petclinic_material.service;

import com.delink.petclinic_material.model.Owner;

import java.util.Set;

/**
 * Created by Adewale.Adeleye on 05/08/2020
 */
public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
