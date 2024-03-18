package com.xworkz.StatesCountryMngt.repository.impl;

import com.xworkz.StatesCountryMngt.dto.CountryDTO;
import com.xworkz.StatesCountryMngt.dto.StateDTO;
import com.xworkz.StatesCountryMngt.entityManagerFactory.EntityManagerFactorySingleton;
import com.xworkz.StatesCountryMngt.repository.CountryRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class CountryRepositoryImpl implements CountryRepository {
    @Override
    public void addCountryDetails(CountryDTO countryDTO) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

            transaction.begin();
            entityManager.persist(countryDTO);
            transaction.commit();
    }

    @Override
    public CountryDTO getCountryOnfoByStateId(int id) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("getCountryOnfoByStateId");
        query.setParameter("stateId", id);

        StateDTO   stateDTO = (StateDTO) query.getSingleResult();

        return stateDTO.getCountry();
    }

}
