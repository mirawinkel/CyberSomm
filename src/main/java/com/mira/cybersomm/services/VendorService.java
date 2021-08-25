package com.mira.cybersomm.services;

import com.mira.cybersomm.models.Vendor;
import com.mira.cybersomm.models.Wine;

public interface VendorService {

    Vendor save(Vendor vendor);
    Iterable<Vendor> findVendorsByCity(String city);
    Vendor findVendorById(int id);
    Vendor findVendorByName(String name);
    Iterable<Vendor> findVendorsByWineListIsContaining(Wine wine);
    Iterable<Vendor> findAll();
    void deleteById(int id);
}
