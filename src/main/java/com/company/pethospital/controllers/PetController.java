package com.company.pethospital.controllers;

import com.company.pethospital.models.Pet;
import com.company.pethospital.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pet")
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping("/find-all-pets")
    public List<Pet> findAll() {
        return petService.findAllPets();
    }

    @GetMapping("/find-by-pet/{id}")
    public ResponseEntity<Pet> findById(@PathVariable("id") Long id) {
        Pet pet = petService.findPetById(id);
        return new ResponseEntity<>(pet, HttpStatus.OK);
    }

    // create pet
    @PostMapping("/create-pet")
    public Pet create(@RequestBody Pet pet) {
        return petService.createPet(pet);
    }

    // update pet
    @PutMapping("/update-pet/{id}")
    public Pet update(@PathVariable Long id, @RequestBody Pet pet) {
        pet.setId(id);
        return petService.createPet(pet);
    }

    // delete pet
    @DeleteMapping("/delete-pet/{id}")
    public void delete(@PathVariable("id") Long id) {
        petService.deletePet(id);
    }

}
