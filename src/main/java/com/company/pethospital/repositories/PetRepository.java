package com.company.pethospital.repositories;

import com.company.pethospital.models.Owner;
import com.company.pethospital.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findByOwnerId(Long owner_id);
}
