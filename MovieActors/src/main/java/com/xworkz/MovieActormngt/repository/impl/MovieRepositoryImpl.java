package com.xworkz.MovieActormngt.repository.impl;

import com.xworkz.MovieActormngt.dto.MovieDTO;
import com.xworkz.MovieActormngt.entityManagerFactory.EntityManagerFactorySingleton;
import com.xworkz.MovieActormngt.repository.MovieRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class MovieRepositoryImpl implements MovieRepository {


    @Override
    public void addMovie(MovieDTO movie) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(movie);
        transaction.commit();
    }
}
