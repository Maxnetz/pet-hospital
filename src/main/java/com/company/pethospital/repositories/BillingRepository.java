package com.company.pethospital.repositories;

import com.company.pethospital.models.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing, Long> {
}
