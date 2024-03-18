package com.xworkz.StatesCountryMngt.service;

import com.xworkz.StatesCountryMngt.dto.CountryDTO;

public interface CountryService {
    boolean ValidateAndAddCountryDetails(CountryDTO countryDTO);

    CountryDTO validateAndgetCountryOnfoByStateId(int id);

}
