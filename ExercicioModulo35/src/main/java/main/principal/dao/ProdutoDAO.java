package main.principal.dao;

import jakarta.persistence.EntityManager;
import main.principal.dao.generic.JPAUtil;
import main.principal.domain.Produto;

public class ProdutoDAO {

    public void cadastrar(Produto produto) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }
    public Produto consultar(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Produto.class, id);
        } finally {
            em.close();
        }
    }
}