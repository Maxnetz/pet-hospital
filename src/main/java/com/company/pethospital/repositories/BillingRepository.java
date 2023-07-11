package com.company.pethospital.repositories;

import com.company.pethospital.models.Billing;
import com.company.pethospital.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillingRepository extends JpaRepository<Billing, Long> {
    List<Billing> findByOwnerId(Long ownerId);
}
