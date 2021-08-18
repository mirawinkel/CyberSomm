package com.reflectionwebdesign.cybersomm.controllers;

import com.reflectionwebdesign.cybersomm.models.Wine;
import com.reflectionwebdesign.cybersomm.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class WineController {

    public WineService wineService;

    @Autowired
    public WineController(WineService wineService) {
        this.wineService = wineService;
    }


    @GetMapping(value="/varietal")
    public Iterable<Wine> findByVarietal(@RequestParam String varietal) {
        return wineService.findWinesByVarietal(varietal);
    }

    @GetMapping(value="/id")
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
}
