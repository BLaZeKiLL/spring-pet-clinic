package org.blazekill.springpetclinic.bootstrap;

import org.blazekill.springpetclinic.model.Owner;
import org.blazekill.springpetclinic.model.Pet;
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

import java.time.LocalDate;

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

        PetType chick = new PetType();
        chick.setName("Chick");
        PetType savedCatPetType = petTypeService.save(chick);

        logger.info("Loaded PetTypes...");

        Owner owner1 = new Owner();
        owner1.setFirstName("Devashish");
        owner1.setLastName("Lal");
        owner1.setAddress("7514 Atlantic Drive, Hastings, MN 55033");
        owner1.setCity("Palo Alto");
        owner1.setTelephone("321456957");

        Pet dogga = new Pet();
        dogga.setPetType(dog);
        dogga.setName("Dogga");
        dogga.setOwner(owner1);
        dogga.setBrithDate(LocalDate.now());

        owner1.getPets().add(dogga);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ashna");
        owner2.setLastName("Kumar");
        owner2.setAddress("175 West Ocean Drive, Montgomery, AL 36109");
        owner2.setCity("Alabama");
        owner2.setTelephone("648951267");

        Pet chuza = new Pet();
        chuza.setPetType(chick);
        chuza.setName("Chuza");
        chuza.setOwner(owner2);
        chuza.setBrithDate(LocalDate.now());

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
