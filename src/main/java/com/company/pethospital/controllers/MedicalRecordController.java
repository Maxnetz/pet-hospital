package com.company.pethospital.controllers;

import com.company.pethospital.models.MedicalRecord;
import com.company.pethospital.services.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medical-record")
public class MedicalRecordController {
    @Autowired
    private MedicalRecordService medicalRecordService;

    @GetMapping("/")
    public List<MedicalRecord> findAll() {
        return medicalRecordService.findAllRecords();
    }

    @GetMapping("/find-by-record")
    public ResponseEntity<MedicalRecord> findById(@PathVariable("id") Long id) {
        MedicalRecord medicalRecord = medicalRecordService.findRecordById(id);
        return new ResponseEntity<>(medicalRecord, HttpStatus.OK);
    }

    @PostMapping("/create-record")
    public MedicalRecord createRecord(@RequestBody MedicalRecord medicalRecord) {
        return medicalRecordService.createRecord(medicalRecord);
    }

    @PostMapping("/update-record/{id}")
    public MedicalRecord updateRecord(@PathVariable("id") Long id, @RequestBody MedicalRecord medicalRecord) {
        medicalRecord.setId(id);
        return medicalRecordService.createRecord(medicalRecord);
    }

    @DeleteMapping("/delete-record/{id}")
    public void deleteRecord(@PathVariable("id") Long id) {
        medicalRecordService.deleteRecord(id);
    }
}
