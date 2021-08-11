package com.reflectionwebdesign.cybersomm.services.impl;

import com.reflectionwebdesign.cybersomm.models.Wine;
import com.reflectionwebdesign.cybersomm.repositories.WineRepository;
import com.reflectionwebdesign.cybersomm.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WineServiceImpl implements WineService {

    private final WineRepository wineRepository;

    @Autowired
    public WineServiceImpl(WineRepository wineRepository) {
        this.wineRepository = wineRepository;
    }

    @Override
    public Wine save(Wine wine) {
        return wineRepository.save(wine);
    }

    @Override
    public Wine findWineById(int id) {
        return wineRepository.findWineById(id);
    }

    @Override
    public Iterable<Wine> findWinesByRegion(String region) {
        return wineRepository.findWinesByRegion(region);
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
    public Iterable<Wine> findWinesByVintage(String vintage) {
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
    @Transactional
    public void deleteWineById(int id) {
        wineRepository.deleteWineById(id);
    }
}
