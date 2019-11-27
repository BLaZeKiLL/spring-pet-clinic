package org.blazekill.springpetclinic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPetClinicApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringPetClinicApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringPetClinicApplication.class, args);
    }


}
