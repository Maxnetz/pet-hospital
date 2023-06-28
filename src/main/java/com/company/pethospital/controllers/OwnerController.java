package com.company.pethospital.controllers;

import com.company.pethospital.models.Owner;
import com.company.pethospital.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/find-all-owners")
    public ResponseEntity<List<Owner>> findAll() {
        List<Owner> List = ownerService.findAllOwners();
        return new ResponseEntity<>(List, HttpStatus.OK);
    }

    @GetMapping("/find-by-owner/{id}")
    public ResponseEntity<Owner> findById(@PathVariable("id") Long id) {
        Owner owner = ownerService.findOwnerById(id);
        return new ResponseEntity<>(owner, HttpStatus.OK);
    }

    @PostMapping("/create-owner")
    public Owner create(@RequestBody Owner owner) {
        return ownerService.createOwner(owner);
    }

    @PutMapping("/update-owner/{id}")
    public Owner update(@PathVariable("id") Long id, @RequestBody Owner owner) {
        owner.setId(id);
        return ownerService.createOwner(owner);
    }

    @DeleteMapping("/delete-owner/{id}")
    public void delete(@PathVariable("id") Long id) {
        ownerService.deleteOwner(id);
    }
}
