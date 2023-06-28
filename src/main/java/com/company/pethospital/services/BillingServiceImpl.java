package com.company.pethospital.services;

import com.company.pethospital.models.Billing;
import com.company.pethospital.models.Owner;
import com.company.pethospital.repositories.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingServiceImpl implements  BillingService {
    @Autowired
    private BillingRepository repository;

    @Override
    public List<Billing> findAllBills() {
        return repository.findAll();
    }

    @Override
    public Billing findBillById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Billing createBill(Billing billing) {
        return repository.save(billing);
    }

    @Override
    public void deleteBill(Long id) {
        repository.deleteById(id);
    }
}
