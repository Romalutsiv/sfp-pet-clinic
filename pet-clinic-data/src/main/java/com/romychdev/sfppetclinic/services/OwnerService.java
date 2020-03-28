package com.romychdev.sfppetclinic.services;

import com.romychdev.sfppetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName ();

    Owner finById (Long id);

    Owner save (Owner owner);

    Set<Owner> findAll();
}
