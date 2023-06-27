package com.company.pethospital.services;

import com.company.pethospital.models.Owner;

import java.util.List;

public interface OwnerService {
    List<Owner> findAllOwners();

    Owner findOwnerById(Long id);

    Owner createOwner(Owner owner);

    void deleteOwner(Long owner);

}
