package com.annonceo.service;

import com.annonceo.model.Ad;
import com.annonceo.repository.AdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdService {
    @Autowired
    private AdRepository adRepository;

    public List<Ad> findAdsByLocation(String location) {
        return adRepository.findByLocation(location);
    }
}
