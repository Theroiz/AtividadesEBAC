package main.principal.dao;

import jakarta.persistence.EntityManager;
import main.principal.dao.generic.JPAUtil;
import main.principal.domain.Venda;

public class VendaDAO {

    public void cadastrar(Venda venda) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(venda);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }
    public Venda consultar(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Venda.class, id);
        } finally {
            em.close();
        }
    }
}