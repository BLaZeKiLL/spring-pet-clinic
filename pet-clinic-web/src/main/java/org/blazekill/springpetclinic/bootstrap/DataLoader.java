package org.blazekill.springpetclinic.bootstrap;

import org.blazekill.springpetclinic.services.OwnerService;
import org.blazekill.springpetclinic.services.VetService;
import org.blazekill.springpetclinic.services.map.OwnerMapService;
import org.blazekill.springpetclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
