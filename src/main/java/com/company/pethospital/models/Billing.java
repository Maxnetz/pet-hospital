package com.company.pethospital.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "billing")
@Getter
@Setter
public class Billing implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long owner_id;

    private Long total_amount;

    public void setId(Long id) {
        this.id = id;
    }
}
