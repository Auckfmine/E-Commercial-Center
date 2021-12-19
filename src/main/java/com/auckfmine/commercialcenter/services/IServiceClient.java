package com.auckfmine.commercialcenter.services;

import com.auckfmine.commercialcenter.entities.Client;

import java.util.List;

public interface IServiceClient {

    void ajouterEtAffecterClientBoutiques(Client client, List<Long>idBoutiques);
}
