package com.delink.petclinic_material.service;

import com.delink.petclinic_material.model.Pet;
import com.delink.petclinic_material.model.Vet;

import java.util.Set;

/**
 * Created by Adewale.Adeleye on 05/08/2020
 */
public interface VetService {
    Vet findById(Long id);
    Vet save(Vet Vet);
    Set<Vet> findAll();
}
