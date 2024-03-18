package com.xworkz.TheaterScreenMngt.repository.impl;

import com.xworkz.TheaterScreenMngt.dto.TheaterDTO;
import com.xworkz.TheaterScreenMngt.entityManagerFactory.EntityManagerFactorySingleton;
import com.xworkz.TheaterScreenMngt.repository.TheaterRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TheaterRepositorympl implements TheaterRepository {

    @Override
    public void addTheater(TheaterDTO theater) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(theater);
        transaction.commit();
    }

}
