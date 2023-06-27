package com.company.pethospital.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

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

    @OneToMany(mappedBy = "owner")
    private List<Pet> pets;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
