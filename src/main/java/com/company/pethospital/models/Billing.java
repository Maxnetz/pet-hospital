package com.company.pethospital.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "billing")
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "owner_id", unique = true)
    private Integer ownerId;

    @Column(name = "invoice_date")
    private Date invoiceDate;

    @Column(name = "total_amount")
    private Integer totalAmount;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    public Billing() {
        // Default constructor required by JPA
    }

    public Billing(Integer ownerId, Date invoiceDate, Integer totalAmount, Timestamp createdAt) {
        this.ownerId = ownerId;
        this.invoiceDate = invoiceDate;
        this.totalAmount = totalAmount;
        this.createdAt = createdAt;
    }

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
