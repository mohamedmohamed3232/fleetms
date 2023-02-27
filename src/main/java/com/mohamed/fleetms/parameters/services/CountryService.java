package com.mohamed.fleetms.parameters.services;

import com.mohamed.fleetms.parameters.models.Country;
import com.mohamed.fleetms.parameters.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAll() {
       return  countryRepository.findAll();
    }
}
