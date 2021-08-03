package com.reflectionwebdesign.cybersomm.services.impl;

import com.reflectionwebdesign.cybersomm.models.Wine;
import com.reflectionwebdesign.cybersomm.repositories.WineRepository;
import com.reflectionwebdesign.cybersomm.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WineServiceImpl implements WineService {

    private final WineRepository wineRepository;

    @Autowired
    public WineServiceImpl(WineRepository wineRepository) {
        this.wineRepository = wineRepository;
    }

    @Override
    public Wine findWineById(int id) {
        return wineRepository.findWineById(id);
    }

    @Override
    public Iterable<Wine> findWinesByAppellation(String appellation) {
        return wineRepository.findWinesByAppellation(appellation);
    }

    @Override
    public Iterable<Wine> findWinesByDescriptor(String descriptor) {
        return wineRepository.findWinesByDescriptor(descriptor);
    }

    @Override
    public Iterable<Wine> findWinesByVarietal(String varietal) {
        return wineRepository.findWinesByVarietal(varietal);
    }

    @Override
    public Iterable<Wine> findWinesByVintage(int vintage) {
        return wineRepository.findWinesByVintage(vintage);
    }

    @Override
    public Iterable<Wine> findWinesByProducer(String producer) {
        return wineRepository.findWinesByProducer(producer);
    }

    @Override
    public Iterable<Wine> findWinesByName(String name) {
        return wineRepository.findWinesByName(name);
    }

    @Override
    public void deleteWineById(int id) {
        wineRepository.deleteWineById(id);
    }
}
