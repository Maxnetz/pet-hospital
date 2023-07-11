package com.company.pethospital.services;

import com.company.pethospital.models.Billing;
import com.company.pethospital.models.MedicalRecord;
import com.company.pethospital.repositories.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordService {
    @Autowired
    private MedicalRecordRepository repository;

    public List<MedicalRecord> findAllRecords() {
        return repository.findAll();
    }

    public MedicalRecord findRecordById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public MedicalRecord createRecord(MedicalRecord medicalRecord) {
        return repository.save(medicalRecord);
    }

    public void deleteRecord(Long id) {
        repository.deleteById(id);
    }
}
