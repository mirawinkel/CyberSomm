package com.reflectionwebdesign.cybersomm.repositories;

import com.reflectionwebdesign.cybersomm.models.Vendor;
import com.reflectionwebdesign.cybersomm.models.Wine;
import org.springframework.data.repository.CrudRepository;

public interface VendorRepository extends CrudRepository<Vendor, Integer> {
    Iterable<Vendor> findVendorsByCity(String city);
    Vendor findVendorById(int id);
    Vendor findVendorByName(String name);
    Iterable<Vendor> findVendorsByWineListIsContaining(Wine wine);
    Iterable<Vendor> findAll();
}
