package com.Xworkz.PasspoerProjectMngt.repository.impl;

import com.Xworkz.PasspoerProjectMngt.dto.UserDTO;
import com.Xworkz.PasspoerProjectMngt.entityManagerFactory.EntityManagerFactorySingleton;
import com.Xworkz.PasspoerProjectMngt.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UserRepositoryImpl implements UserRepository {
    public void addUserRegistration(UserDTO dto) {

        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(dto);
        transaction.commit();
    }
}
