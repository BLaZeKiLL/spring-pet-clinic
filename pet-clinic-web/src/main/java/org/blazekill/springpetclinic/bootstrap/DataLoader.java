package org.blazekill.springpetclinic.bootstrap;

import org.blazekill.springpetclinic.model.Owner;
import org.blazekill.springpetclinic.model.PetType;
import org.blazekill.springpetclinic.model.Vet;
import org.blazekill.springpetclinic.services.OwnerService;
import org.blazekill.springpetclinic.services.PetTypeService;
import org.blazekill.springpetclinic.services.VetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(DataLoader.class);

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        logger.info("Loaded PetTypes...");

        Owner owner1 = new Owner();
        owner1.setFirstName("Devashish");
        owner1.setLastName("Lal");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ashna");
        owner2.setLastName("Kumar");

        ownerService.save(owner2);

        logger.info("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("D");
        vet1.setLastName("Doctor");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("A");
        vet2.setLastName("Doctor");

        vetService.save(vet2);

        logger.info("Loaded Vets...");
    }

}
