package com.xworkz.MallShopMngt.repository.impl;

import com.xworkz.MallShopMngt.dto.MallDTO;
import com.xworkz.MallShopMngt.entityManagerFactory.EntityManagerFactorySingleton;
import com.xworkz.MallShopMngt.repository.MallRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class MallRepositoryIMpl implements MallRepository {
    @Override
    public void addMall(MallDTO mall) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(mall);
        transaction.commit();
    }
}
