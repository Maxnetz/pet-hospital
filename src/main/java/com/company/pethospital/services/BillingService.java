package com.company.pethospital.services;

import com.company.pethospital.models.Billing;
import com.company.pethospital.repositories.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {
    @Autowired
    private BillingRepository billingRepository;

    public List<Billing> findAllBills() {
        return billingRepository.findAll();
    }

    public Billing findBillById(Long id) {
        return billingRepository.findById(id).orElse(null);
    }

    public Billing createBill(Billing billing) {
        return billingRepository.save(billing);
    }


    public void deleteBill(Long id) {
        billingRepository.deleteById(id);
    }
}
