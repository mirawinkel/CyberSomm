package com.reflectionwebdesign.cybersomm.services;

import com.reflectionwebdesign.cybersomm.models.Vendor;
import com.reflectionwebdesign.cybersomm.models.Wine;

public interface VendorService {

    Vendor findVendorByCity(String city);
    Vendor findVendorById(int id);
    Vendor findVendorByName(String name);
    Vendor findVendorByWineListIsContaining(Wine wine);
}
