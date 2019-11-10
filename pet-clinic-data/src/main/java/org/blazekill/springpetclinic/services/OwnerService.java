package org.blazekill.springpetclinic.services;

import org.blazekill.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
