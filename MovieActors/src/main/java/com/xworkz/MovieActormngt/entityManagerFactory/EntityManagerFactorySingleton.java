package com.xworkz.MovieActormngt.entityManagerFactory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

    private static EntityManagerFactory factory=null;

    public  static  EntityManagerFactory getFactory(){
            return factory;
    }

    static {
        factory= Persistence.createEntityManagerFactory("com.pkk");
    }
}
