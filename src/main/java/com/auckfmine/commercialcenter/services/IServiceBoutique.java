package com.auckfmine.commercialcenter.services;

import com.auckfmine.commercialcenter.entities.Boutique;

import java.util.List;

public interface IServiceBoutique {
    void ajouterEtAffecterListeBoutiques(List<Boutique> boutiques,Long idCentre);
}
