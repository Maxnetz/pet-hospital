package com.company.pethospital.services;

import com.company.pethospital.models.Billing;
import com.company.pethospital.models.Owner;
import com.company.pethospital.models.Pet;
import com.company.pethospital.repositories.BillingRepository;
import com.company.pethospital.repositories.MedicalRecordRepository;
import com.company.pethospital.repositories.OwnerRepository;
import com.company.pethospital.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    BillingRepository billingRepository;

    @Autowired
    MedicalRecordRepository medicalRecordRepository;

    @Autowired
    OwnerRepository ownerRepository;

    @Autowired
    PetRepository petRepository;


    public Owner getOwnerWithBillingAndPets(Long ownerId) {
        Owner owner = ownerRepository.findById(ownerId).orElse(null);
        if (owner != null) {
            List<Billing> billings = billingRepository.findByOwner(owner);
            List<Pet> pets = petRepository.findByOwnerId(owner.getId());
            owner.setBillings(billings);
            owner.setPets(pets);
        }
        return owner;
    }
}
