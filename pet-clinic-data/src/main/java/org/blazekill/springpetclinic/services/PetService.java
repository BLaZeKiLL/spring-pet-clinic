package org.blazekill.springpetclinic.services;

import org.blazekill.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();

}
