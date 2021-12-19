package com.auckfmine.commercialcenter.repositories;

import com.auckfmine.commercialcenter.entities.CentreCommercial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICentreCommercialRepository extends CrudRepository<CentreCommercial,Long> {
}
