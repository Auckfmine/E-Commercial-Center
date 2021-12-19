package com.auckfmine.commercialcenter.repositories;

import com.auckfmine.commercialcenter.entities.Boutique;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBoutiqueRepository extends CrudRepository<Boutique,Long> {
}
