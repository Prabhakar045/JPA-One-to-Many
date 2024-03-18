package com.xworkz.StatesCountryMngt;

import com.xworkz.StatesCountryMngt.dto.CountryDTO;
import com.xworkz.StatesCountryMngt.dto.StateDTO;
import com.xworkz.StatesCountryMngt.service.CountryService;
import com.xworkz.StatesCountryMngt.service.impl.CountryServiceImpl;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        CountryService countryService = new CountryServiceImpl();


            CountryDTO countryDTO = new CountryDTO();
//            countryDTO.setCountryName("India");
//
//
            List<StateDTO> stateDTOList = new ArrayList<>();
//
//
//            StateDTO stateDTO1 = new StateDTO();
//            stateDTO1.setStateName("Karnataka");
//
//            StateDTO stateDTO2 = new StateDTO();
//            stateDTO2.setStateName("Maharastra");
//
//
//            stateDTOList.add(stateDTO1);
//            stateDTOList.add(stateDTO2);
//
//            countryDTO.setStates(stateDTOList);
//
//
//            countryService.ValidateAndAddCountryDetails(countryDTO);
//            System.out.println("Data added successfully.");


        Scanner sc = new Scanner(System.in);
            int stateId= sc.nextInt();
        CountryDTO country = countryService.validateAndgetCountryOnfoByStateId(stateId);
        System.out.println(country);
                                                                                                                                                                                     System.out.println("India");


    }
}
