package com.reflectionwebdesign.cybersomm.services.impl;

import com.reflectionwebdesign.cybersomm.models.Vendor;
import com.reflectionwebdesign.cybersomm.models.Wine;
import com.reflectionwebdesign.cybersomm.repositories.VendorRepository;
import com.reflectionwebdesign.cybersomm.services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;

public class VendorServiceImpl implements VendorService {

    VendorRepository vendorRepository;

    @Autowired
    public VendorServiceImpl(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public Vendor findVendorByCity(String city) {
        return vendorRepository.findVendorByCity(city);
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
    public Vendor findVendorByWineListIsContaining(Wine wine) {
        return vendorRepository.findVendorByWineListIsContaining(wine);
    }
}
