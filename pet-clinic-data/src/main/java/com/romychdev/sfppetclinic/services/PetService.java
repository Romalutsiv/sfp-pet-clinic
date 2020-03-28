package com.romychdev.sfppetclinic.services;

import com.romychdev.sfppetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet finById (Long id);

    Pet save (Pet pet);

    Set<Pet> findAll();
}
