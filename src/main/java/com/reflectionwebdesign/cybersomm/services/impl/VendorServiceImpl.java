package com.reflectionwebdesign.cybersomm.services.impl;

import com.reflectionwebdesign.cybersomm.models.Vendor;
import com.reflectionwebdesign.cybersomm.models.Wine;
import com.reflectionwebdesign.cybersomm.repositories.VendorRepository;
import com.reflectionwebdesign.cybersomm.services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VendorServiceImpl implements VendorService {

    private final VendorRepository vendorRepository;

    @Autowired
    public VendorServiceImpl(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public Vendor save(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        vendorRepository.deleteById(id);
    }

    @Override
    public Iterable<Vendor> findVendorsByCity(String city) {
        return vendorRepository.findVendorsByCity(city);
    }

    @Override
    public Vendor findVendorById(int id) {
        return vendorRepository.findVendorById(id);
    }

    @Override
    public Vendor findVendorByName(String name) {
        return vendorRepository.findVendorByName(name);
    }

    @Override
    public Iterable<Vendor> findVendorsByWineListIsContaining(Wine wine) {
        return vendorRepository.findVendorsByWineListIsContaining(wine);
    }
}
