package com.reflectionwebdesign.cybersomm.repositories;

import com.reflectionwebdesign.cybersomm.models.Wine;
import org.springframework.data.repository.CrudRepository;

public interface WineRepository extends CrudRepository<Wine, Integer> {

    Iterable<Wine> findWinesByRegion(String region);
    Iterable<Wine> findWinesByDescriptor(String descriptor);
    Iterable<Wine> findWinesByVintage(String vintage);
    Iterable<Wine> findWinesByName(String name);
    Iterable<Wine> findWinesByProducer(String producer);
    Iterable<Wine> findWinesByVarietal(String varietal);
    void deleteWineById(long id);
    Wine findWineById(long id);
}
