package com.company.pethospital.services;

import com.company.pethospital.models.Billing;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BillingService {
    List<Billing> findAllBills();

    Billing findBillById(Long id);

    Billing createBill(Billing billing);

    void deleteBill(Long id);
}
