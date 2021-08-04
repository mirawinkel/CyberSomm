package com.reflectionwebdesign.cybersomm.services;

import com.reflectionwebdesign.cybersomm.models.Wine;

public interface WineService {

    Wine save(Wine wine);
    Wine findWineById(int id);
    Iterable<Wine> findWinesByAppellation(String appellation);
    Iterable<Wine> findWinesByDescriptor(String descriptor);
    Iterable<Wine> findWinesByVintage(int vintage);
    Iterable<Wine> findWinesByName(String name);
    Iterable<Wine> findWinesByProducer(String producer);
    Iterable<Wine> findWinesByVarietal(String varietal);
    void deleteWineById(int id);
}
