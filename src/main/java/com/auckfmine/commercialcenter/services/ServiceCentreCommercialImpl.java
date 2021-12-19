package com.auckfmine.commercialcenter.services;

import com.auckfmine.commercialcenter.entities.CentreCommercial;
import com.auckfmine.commercialcenter.repositories.IBoutiqueRepository;
import com.auckfmine.commercialcenter.repositories.ICentreCommercialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ServiceCentreCommercialImpl implements IServiceCentreCommercial{
    @Autowired
    ICentreCommercialRepository centreCommercialRepository;

    @Autowired
    IBoutiqueRepository boutiqueRepository;

    @Transactional
    @Override
    public void ajouterCentreCommercial(CentreCommercial centreCommercial) {
        centreCommercial.getBoutiques().forEach(boutique ->{
            boutique.setCentreCommercial(centreCommercial);

        });
        centreCommercialRepository.save(centreCommercial);
    }
}
