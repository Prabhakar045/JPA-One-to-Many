package com.xworkz.StatesCountryMngt.repository;

import com.xworkz.StatesCountryMngt.dto.CountryDTO;

public interface CountryRepository {

    void addCountryDetails(CountryDTO countryDTO);

    CountryDTO getCountryOnfoByStateId(int id);
}
