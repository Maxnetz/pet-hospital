package com.company.pethospital.services;

import com.company.pethospital.models.Owner;
import com.company.pethospital.models.Pet;

import java.util.List;

public interface PetService {
    List<Pet> findAllPets();

    Pet findPetById(Long id);

    Pet createPet(Pet pet);

    void deletePet(Long pet);

}
