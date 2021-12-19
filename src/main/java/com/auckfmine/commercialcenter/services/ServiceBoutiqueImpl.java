package com.auckfmine.commercialcenter.services;

import com.auckfmine.commercialcenter.entities.Boutique;
import com.auckfmine.commercialcenter.entities.CentreCommercial;
import com.auckfmine.commercialcenter.repositories.IBoutiqueRepository;
import com.auckfmine.commercialcenter.repositories.ICentreCommercialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceBoutiqueImpl implements IServiceBoutique{
    @Autowired
    IBoutiqueRepository boutiqueRepository;
    @Autowired
    ICentreCommercialRepository centreCommercialRepository;


    @Override
    public void ajouterEtAffecterListeBoutiques(List<Boutique> boutiques, Long idCentre) {
        CentreCommercial centreCommercial = centreCommercialRepository.findById(idCentre).orElse(null);
        boutiques.forEach(boutique -> {
            boutique.setCentreCommercial(centreCommercial);
            boutiqueRepository.save(boutique);
        });

    }
}
