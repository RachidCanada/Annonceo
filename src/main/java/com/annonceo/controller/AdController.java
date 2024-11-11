package com.annonceo.controller;

import com.annonceo.model.Ad;
import com.annonceo.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ads")
public class AdController {

    @Autowired
    private AdService adService;

    // Endpoint pour obtenir des annonces par emplacement
    @GetMapping("/location/{location}")
    public List<Ad> getAdsByLocation(@PathVariable String location) {
        return adService.findAdsByLocation(location);
    }
}
