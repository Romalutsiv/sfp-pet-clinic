package com.romychdev.sfppetclinic.bootstrap;

import com.romychdev.sfppetclinic.model.Owner;
import com.romychdev.sfppetclinic.model.Vet;
import com.romychdev.sfppetclinic.services.OwnerService;
import com.romychdev.sfppetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstname("Misha");
        owner1.setLastname("Rat");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstname("Sem");
        owner2.setLastname("jackson");

        ownerService.save(owner2);
        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstname("Sam");
        vet1.setLastname("Axe");

        vetService.save(vet1);

         Vet vet2 = new Vet();
        vet2.setFirstname("Harry");
        vet2.setLastname("Potter");

        vetService.save(vet2);
        System.out.println("Loaded vets....");
    }
}
