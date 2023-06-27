package com.company.pethospital.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Entity
@Table(name = "pet")
@Getter
@Setter
public class Pet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String species;

    private String breed;

    private Integer age;

    private String size;
    
    private Long owner_id;

    public void setId(Long id) {
        this.id = id;
    }
}
