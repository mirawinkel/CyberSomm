package com.mira.cybersomm.services.impl;

import static org.junit.jupiter.api.Assertions.*;

import com.mira.cybersomm.models.Wine;
import com.mira.cybersomm.services.WineService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WineServiceImplTest {

    @Autowired
    WineService wineService;

    @Test
    void testFindWinesByRegion() {
        Wine wine = new Wine();
        wine.setRegion("test");
        wineService.save(wine);
        Wine wine2 = new Wine();
        wine2.setRegion("tester");
        wineService.save(wine2);
        Iterable<Wine> results = wineService.findWinesByRegion("test");
        results.forEach(result -> assertEquals(wine.getRegion(), result.getRegion()));
    }

    @Test
    void testFindWinesByDescriptor() {
        Wine wine = new Wine();
        wine.getDescriptor().add("test");
        wineService.save(wine);
        Wine wine2 = new Wine();
        wine2.getDescriptor().add("tester");
        wineService.save(wine2);
        Iterable<Wine> results = wineService.findWinesByRegion("test");
        results.forEach(result -> assertTrue(result.getDescriptor().contains("test")));
    }

    @Test
    void testFindWinesByVintage() {
        Wine wine = new Wine();
        wine.setVintage("1");
        wineService.save(wine);
        Wine wine2 = new Wine();
        wine2.setVintage("2");
        wineService.save(wine2);
        Iterable<Wine> results = wineService.findWinesByVintage("1");
        results.forEach(result -> assertEquals(wine.getVintage(), result.getVintage()));
    }

    @Test
    void testFindWinesByName() {
        Wine wine = new Wine();
        wine.setName("test");
        wineService.save(wine);
        Wine wine2 = new Wine();
        wine2.setName("tester");
        wineService.save(wine2);
        Iterable<Wine> results = wineService.findWinesByName("test");
        results.forEach(result -> assertEquals(wine.getName(), result.getName()));
    }

    @Test
    void testFindWinesByProducer() {
        Wine wine = new Wine();
        wine.setProducer("test");
        wineService.save(wine);
        Wine wine2 = new Wine();
        wine2.setProducer("tester");
        wineService.save(wine2);
        Iterable<Wine> results = wineService.findWinesByProducer("test");
        results.forEach(result -> assertEquals(wine.getProducer(), result.getProducer()));
    }

    @Test
    void testFindWinesByVarietal() {
        Wine wine = new Wine();
        wine.setVarietal("test");
        wineService.save(wine);
        Wine wine2 = new Wine();
        wine2.setVarietal("tester");
        wineService.save(wine2);
        Iterable<Wine> results = wineService.findWinesByVarietal("test");
        results.forEach(result -> assertEquals(wine.getVarietal(), result.getVarietal()));
    }

    @Test
    void testFindWineById() {
        Wine wine = new Wine();
        wine.setVarietal("test");
        Wine expected = wineService.save(wine);
        assertEquals(expected, wineService.findWineById(expected.getId()));
    }

    @Test
    void testDeleteWineById() {
        Wine wine = new Wine();
        wine.setVarietal("test");
        Wine expected = wineService.save(wine);
        wineService.deleteWineById(expected.getId());
        assertNull(wineService.findWineById(expected.getId()));
    }
}
