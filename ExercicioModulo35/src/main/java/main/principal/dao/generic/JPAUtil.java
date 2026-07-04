package main.principal.dao.generic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory FACTORY = 
        Persistence.createEntityManagerFactory("vendas_online_pu");

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }
}