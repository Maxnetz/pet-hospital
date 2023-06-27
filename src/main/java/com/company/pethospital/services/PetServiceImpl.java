package com.company.pethospital.services;

import com.company.pethospital.models.Pet;
import com.company.pethospital.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetRepository repository;

    @Override
    public List<Pet> findAllPets() {
        return repository.findAll();
    }

    @Override
    public Pet findPetById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Pet createPet(Pet pet) {
        return repository.save(pet);
    }

    @Override
    public void deletePet(Long id) {
        repository.deleteById(id);
    }

}
