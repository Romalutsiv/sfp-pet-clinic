package com.romychdev.sfppetclinic.services;

import com.romychdev.sfppetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet finById (Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();
}
