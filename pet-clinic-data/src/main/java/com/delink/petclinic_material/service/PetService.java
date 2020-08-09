package com.delink.petclinic_material.service;

import com.delink.petclinic_material.model.Owner;
import com.delink.petclinic_material.model.Pet;

import java.util.Set;

/**
 * Created by Adewale.Adeleye on 05/08/2020
 */
public interface PetService extends CrudService<Pet, Long> {
    Pet findById(Long id);
    Pet save(Pet Pet);
    Set<Pet> findAll();
}
