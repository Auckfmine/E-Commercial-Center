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
public class Boutique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    @ManyToOne(cascade = CascadeType.ALL)
    private CentreCommercial centreCommercial;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "boutiques")
    private Set<Client>clients;
}
