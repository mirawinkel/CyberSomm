package com.mira.cybersomm.controllers;

import com.mira.cybersomm.models.Wine;
import com.mira.cybersomm.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class WineController {
//Rest controller execution of wine services
    public WineService wineService;

    @Autowired
    public WineController(WineService wineService) {
        this.wineService = wineService;
    }

    @GetMapping(value="/varietal")
    public Iterable<Wine> findByVarietal(@RequestParam String varietal) {
        return wineService.findWinesByVarietal(varietal);
    }

    @GetMapping(value="/wineId")
    public Wine findById(@RequestParam long id) {
        return wineService.findWineById(id);
    }

    @GetMapping(value="/vintage")
    public Iterable<Wine> findByVintage(@RequestParam String vintage) {
        return wineService.findWinesByVintage(vintage);
    }

    @GetMapping(value="/region")
    public Iterable<Wine> findByRegion(@RequestParam String region) {
        return wineService.findWinesByVintage(region);
    }

    @GetMapping("/allWines")
    public Iterable<Wine> findAllWines() {
        return wineService.findAll();
    }
}
