package com.company.pethospital.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "owner")
@Getter
@Setter
public class Owner implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer contact_number;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
