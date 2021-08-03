package com.reflectionwebdesign.cybersomm.services;

import com.reflectionwebdesign.cybersomm.models.Wine;

public interface WineService {
    Wine findWineById(int id);
    Wine findWineByAppellation(String appellation);
    Wine findWineByDescriptor(String descriptor);
    Wine findWineByVarietal(String varietal);
    Wine findWineByVintage(int vintage);
    Wine findWineByProducer(String producer);
    Wine findWineByName(String name);
    void deleteWineById(int id);
}
