package com.company.pethospital.services;

import com.company.pethospital.models.Pet;
import com.company.pethospital.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository repository;

    public List<Pet> findAllPets() {
        return repository.findAll();
    }

    public Pet findPetById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Pet createPet(Pet pet) {
        return repository.save(pet);
    }

    public void deletePet(Long id) {
        repository.deleteById(id);
    }
}
