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

public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Boutique> boutiques;
}
