package com.auckfmine.commercialcenter.services;

import com.auckfmine.commercialcenter.entities.Boutique;
import com.auckfmine.commercialcenter.entities.Client;
import com.auckfmine.commercialcenter.repositories.IBoutiqueRepository;
import com.auckfmine.commercialcenter.repositories.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ServiceClientImpl implements IServiceClient{

    @Autowired
    IClientRepository clientRepository;

    @Autowired
    IBoutiqueRepository boutiqueRepository;

    @Override
    public void ajouterEtAffecterClientBoutiques(Client client, List<Long> idBoutiques) {

        Set<Boutique> boutiques = new HashSet<>();

        idBoutiques.forEach(id->{
           boutiques.add(boutiqueRepository.findById(id).orElse(null));

        });

        client.setBoutiques(boutiques);
        clientRepository.save(client);

    }
}
