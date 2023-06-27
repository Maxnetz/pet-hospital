package com.company.pethospital.services;

import com.company.pethospital.models.Pet;

import java.util.List;

public interface PetService {
    List<Pet> findAllPets();
}
