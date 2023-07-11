package com.company.pethospital.services;

import com.company.pethospital.models.Owner;
import com.company.pethospital.models.Pet;
import com.company.pethospital.repositories.OwnerRepository;
import com.company.pethospital.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    OwnerRepository ownerRepository;

    @Autowired
    PetRepository petRepository;

    public List<Owner> getAllOwnersWithPets() {
        List<Owner> owners = ownerRepository.findAll();

        for (Owner owner : owners) {
            List<Pet> pets = petRepository.findByOwnerId(owner.getId());
            owner.setPets(pets);
        }

        return owners;
    }
}
