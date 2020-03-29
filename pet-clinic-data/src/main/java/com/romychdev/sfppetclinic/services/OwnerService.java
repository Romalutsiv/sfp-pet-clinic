package com.romychdev.sfppetclinic.services;

import com.romychdev.sfppetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName (String lastName);

}
