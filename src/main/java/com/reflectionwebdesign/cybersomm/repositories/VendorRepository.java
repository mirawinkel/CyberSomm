package com.reflectionwebdesign.cybersomm.repositories;

import com.reflectionwebdesign.cybersomm.models.Vendor;
import com.reflectionwebdesign.cybersomm.models.Wine;
import org.springframework.data.repository.CrudRepository;

public interface VendorRepository extends CrudRepository<Vendor, Integer> {
    Vendor findVendorByCity(String city);
    Vendor findVendorById(int id);
    Vendor findVendorByName(String name);
    Vendor findVendorByWineListIsContaining(Wine wine);
}
