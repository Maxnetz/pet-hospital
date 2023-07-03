package com.company.pethospital.services;

import com.company.pethospital.models.Billing;
import com.company.pethospital.models.MedicalRecord;

import java.util.List;

public interface MedicalRecordService {
    List<MedicalRecord> findAllRecords();

    MedicalRecord findRecordById(Long id);

    MedicalRecord createRecord(MedicalRecord medicalRecord);

    void deleteRecord(Long id);
}
