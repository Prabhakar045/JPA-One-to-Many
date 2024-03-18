package com.xworkz.StatesCountryMngt.service.impl;

import com.xworkz.StatesCountryMngt.dto.CountryDTO;
import com.xworkz.StatesCountryMngt.repository.CountryRepository;
import com.xworkz.StatesCountryMngt.repository.impl.CountryRepositoryImpl;
import com.xworkz.StatesCountryMngt.service.CountryService;

public class CountryServiceImpl implements CountryService {

    CountryRepository countryRepository;

    public CountryServiceImpl() {
        countryRepository = new CountryRepositoryImpl();
    }

    @Override
    public boolean ValidateAndAddCountryDetails(CountryDTO countryDTO) {
        if (countryDTO != null) {
            countryRepository.addCountryDetails(countryDTO);
            return true;
        }


        return false;
    }

    @Override
    public CountryDTO validateAndgetCountryOnfoByStateId(int id) {
        System.out.println("service layer");
        if (id > 0) {
            System.out.println("if condition of service layer");
            return             countryRepository.getCountryOnfoByStateId(id);

        }
        return null;
    }
}
