package com.delink.petclinic_material.model;

import javax.persistence.MappedSuperclass;

/**
 * Created by Adewale.Adeleye on 05/08/2020
 */
@MappedSuperclass
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
