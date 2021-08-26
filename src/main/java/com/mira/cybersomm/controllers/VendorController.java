package com.mira.cybersomm.controllers;

import com.mira.cybersomm.models.Vendor;
import com.mira.cybersomm.services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class VendorController {
//RestController execution of vendor services
    public VendorService vendorService;

    @Autowired
    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping(value="/vendorCity")
    public Iterable<Vendor> findByCity(@RequestParam String city) {
        return vendorService.findVendorsByCity(city);
    }

    @GetMapping(value = "/vendorName")
    public Vendor findByName(@RequestParam String name) {
        return vendorService.findVendorByName(name);
    }

    @GetMapping(value = "/allVendors")
    public Iterable<Vendor> findAll() {
        return vendorService.findAll();
    }
}
