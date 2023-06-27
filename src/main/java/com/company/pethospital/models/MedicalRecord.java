package com.company.pethospital.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "medical_record")
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "pet_id", unique = true)
    private Integer petId;

    @Column(nullable = false)
    private Date date;

    private String diagnosis;

    private String medication;

    private String note;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    public MedicalRecord() {
        // Default constructor required by JPA
    }

    public MedicalRecord(Integer petId, Date date, String diagnosis, String medication, String note, Timestamp createdAt) {
        this.petId = petId;
        this.date = date;
        this.diagnosis = diagnosis;
        this.medication = medication;
        this.note = note;
        this.createdAt = createdAt;
    }

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}

