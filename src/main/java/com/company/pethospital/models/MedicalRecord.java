package com.company.pethospital.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "medical_record")
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pet_id", unique = true)
    private Long petId;

    @Column(name = "invoice_date", nullable = false)
    private Date invoiceDate;

    private String diagnosis;

    private String medication;

    private String note;

    @PrePersist
    private void prePersist() {
        invoiceDate = new Date(System.currentTimeMillis());
    }
}

