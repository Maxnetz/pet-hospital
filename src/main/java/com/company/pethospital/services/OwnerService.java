package com.company.pethospital.services;

import com.company.pethospital.models.Owner;
import com.company.pethospital.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository repository;


    public List<Owner> findAllOwners() {
        return repository.findAll();
    }


    public Owner findOwnerById(Long id) {
        return repository.findById(id).orElse(null);
    }


    public Owner createOwner(Owner owner) {
        return repository.save(owner);
    }


    public void deleteOwner(Long id) {
        repository.deleteById(id);
    }
}
