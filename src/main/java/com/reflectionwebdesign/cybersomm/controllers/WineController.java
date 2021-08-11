package com.reflectionwebdesign.cybersomm.controllers;

import com.reflectionwebdesign.cybersomm.models.Wine;
import com.reflectionwebdesign.cybersomm.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WineController {

    public WineService wineService;

    @Autowired
    public WineController(WineService wineService) {
        this.wineService = wineService;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value="/findWine")
    public Iterable<Wine> findWine(@RequestParam String varietal) {
        return wineService.findWinesByVarietal(varietal);
    }
}
