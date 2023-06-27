package com.company.pethospital.controllers;

import com.company.pethospital.models.Pet;
import com.company.pethospital.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pet")
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping("/find-all-pets")
    public List<Pet> findAll(){
        return petService.findAllPets();
    }

    // Todo findbyid

    // create pet

    // update pet

    // delete pet

}
