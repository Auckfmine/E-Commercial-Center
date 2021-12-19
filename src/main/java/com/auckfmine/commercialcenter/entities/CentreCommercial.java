package com.auckfmine.commercialcenter.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CentreCommercial implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String adresse;
    private String login;
    private String password;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "centreCommercial")
    private Set<Boutique> boutiques;

}
