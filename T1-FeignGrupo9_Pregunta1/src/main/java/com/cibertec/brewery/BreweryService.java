package com.cibertec.brewery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BreweryService {

    private final BreweryClient breweryClient;

    @Autowired
    public BreweryService(BreweryClient breweryClient) {
        this.breweryClient = breweryClient;
    }

    // p1: solo micro de California
    public List<BreweryData> getMicroCalifornia() {
        List<BreweryData> all = breweryClient.getBreweries();
        if (all == null) {
            return Collections.emptyList();
        }

        return all.stream()
                .filter(b -> "micro".equalsIgnoreCase(b.getBrewery_type()))
                .filter(b -> "California".equalsIgnoreCase(b.getState()))
                .collect(Collectors.toList());
    }
}
