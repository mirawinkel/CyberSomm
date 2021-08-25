package com.mira.cybersomm.services;

import com.mira.cybersomm.models.Wine;

public interface WineService {

    Wine save(Wine wine);
    Wine findWineById(long id);
    Iterable<Wine> findWinesByRegion(String region);
    Iterable<Wine> findWinesByDescriptor(String descriptor);
    Iterable<Wine> findWinesByVintage(String vintage);
    Iterable<Wine> findWinesByName(String name);
    Iterable<Wine> findWinesByProducer(String producer);
    Iterable<Wine> findWinesByVarietal(String varietal);
    Iterable<Wine> findAll();
    void deleteWineById(long id);

}
