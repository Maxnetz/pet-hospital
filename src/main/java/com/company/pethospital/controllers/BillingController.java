package com.company.pethospital.controllers;

import com.company.pethospital.models.Billing;
import com.company.pethospital.services.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billing")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @GetMapping("/")
    public List<Billing> findAll() {
        return billingService.findAllBills();
    }

    @GetMapping("/find-by-bill/{id}")
    public ResponseEntity<Billing> findById(@PathVariable("id") Long id) {
        Billing billing = billingService.findBillById(id);
        return new ResponseEntity<>(billing, HttpStatus.OK);
    }

    @PostMapping("/create-bill")
    public Billing create(@RequestBody Billing billing) {
        return billingService.createBill(billing);
    }

    @PutMapping("/update-bill/{id}")
    public Billing update(@PathVariable("id") Long id, @RequestBody Billing billing) {
        billing.setId(id);
        return billingService.createBill(billing);
    }

    @DeleteMapping("/delete-bill/{id}")
    public void delete(@PathVariable("id") Long id) {
        billingService.deleteBill(id);
    }
}
