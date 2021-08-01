package com.reflectionwebdesign.cybersomm.repositories;

import com.reflectionwebdesign.cybersomm.models.Wine;
import org.springframework.data.repository.CrudRepository;

public interface WineRepository extends CrudRepository<Wine, Integer> {
    Wine findById(int id);
    Wine findWineByAppellation(String appellation);
    Wine findWineByDescriptor(String descriptor);
    Wine findWineByVarietal(String varietal);
    Wine findWineByVintage(int vintage);
    Wine findWineByProducer(String producer);
    Wine findWineByName(String name);
}
