package com.reflectionwebdesign.cybersomm.services.impl;

import com.reflectionwebdesign.cybersomm.models.Wine;
import com.reflectionwebdesign.cybersomm.repositories.WineRepository;
import com.reflectionwebdesign.cybersomm.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;

public class WineServiceImpl implements WineService {

    private WineRepository wineRepository;

    @Autowired
    public WineServiceImpl(WineRepository wineRepository) {
        this.wineRepository = wineRepository;
    }

    @Override
    public Wine findWineById(int id) {
        return wineRepository.findWineById(id);
    }

    @Override
    public Wine findWineByAppellation(String appellation) {
        return wineRepository.findWineByAppellation(appellation);
    }

    @Override
    public Wine findWineByDescriptor(String descriptor) {
        return wineRepository.findWineByDescriptor(descriptor);
    }

    @Override
    public Wine findWineByVarietal(String varietal) {
        return wineRepository.findWineByVarietal(varietal);
    }

    @Override
    public Wine findWineByVintage(int vintage) {
        return wineRepository.findWineByVintage(vintage);
    }

    @Override
    public Wine findWineByProducer(String producer) {
        return wineRepository.findWineByProducer(producer);
    }

    @Override
    public Wine findWineByName(String name) {
        return wineRepository.findWineByName(name);
    }

    @Override
    public void deleteWineById(int id) {
        wineRepository.deleteWineById(id);
    }
}
