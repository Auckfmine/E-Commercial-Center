package com.auckfmine.commercialcenter.repositories;

import com.auckfmine.commercialcenter.entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends CrudRepository<Client,Long> {
}
