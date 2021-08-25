package com.mira.cybersomm.services.impl;

import com.mira.cybersomm.models.Vendor;
import com.mira.cybersomm.models.Wine;
import com.mira.cybersomm.services.VendorService;
import com.mira.cybersomm.services.WineService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class VendorServiceImplTest {

    @Autowired
    VendorService vendorService;

    @Autowired
    WineService wineService;

    @Test
    void testFindVendorByName() {
        Vendor vendor = new Vendor();
        vendor.setName("test");
        Vendor expected = vendorService.save(vendor);
        assertEquals(expected.getName(), vendorService.findVendorByName("test").getName());
    }

    @Test
    void testFindVendorById() {
        Vendor vendor = new Vendor();
        Vendor expected = vendorService.save(vendor);
        assertEquals(expected, vendorService.findVendorById(expected.getId()));
    }

    @Test
    void testFindVendorsByCity() {
        Vendor vendor = new Vendor();
        vendor.setCity("test");
        vendorService.save(vendor);
        Vendor vendor2 = new Vendor();
        vendor2.setCity("test");
        vendorService.save(vendor2);
        Vendor vendor3 = new Vendor();
        vendor3.setCity("tester");
        vendorService.save(vendor3);
        Iterable<Vendor> results = vendorService.findVendorsByCity("test");
        results.forEach(result -> assertEquals("test", result.getCity()));
    }

    @Test
    void testFindVendorsByWineListIsContaining() {
        Vendor vendor = new Vendor();
        Vendor vendor2 = new Vendor();
        Vendor vendor3 = new Vendor();
        Wine wine1 = new Wine();
        Wine wine2 = new Wine();
        Wine wine3 = new Wine();
        Wine list1 = wineService.save(wine1);
        Wine list2 = wineService.save(wine2);
        Wine list3 = wineService.save(wine3);
        vendor.getWineList().add(list1);
        vendor.getWineList().add(list2);
        vendor2.getWineList().add(list2);
        vendor2.getWineList().add(list3);
        vendor3.getWineList().add(list1);
        vendorService.save(vendor);
        vendorService.save(vendor2);
        vendorService.save(vendor3);
        Iterable<Vendor> results = vendorService.findVendorsByWineListIsContaining(list1);
        results.forEach(result -> assertTrue(result.getWineList().contains(list1)));
    }

    @Test
    void testDeleteById() {
        Vendor vendor = new Vendor();
        Vendor expected = vendorService.save(vendor);
        vendorService.deleteById(expected.getId());
        assertNull(vendorService.findVendorById(expected.getId()));
    }
}
