package main.principal.dao.generic;

import jakarta.persistence.EntityManager;
import java.util.List;
//CRUD
public abstract class GenericDAO<T, E> implements IGenericDAO<T, E> {

    protected Class<T> persistenteClass;

    public GenericDAO(Class<T> persistenteClass) {
        this.persistenteClass = persistenteClass;
    }

    @Override
    public T cadastrar(T entity) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            return entity;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public T alterar(T entity) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            T entityMerged = em.merge(entity);
            em.getTransaction().commit();
            return entityMerged;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public T consultar(E id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(persistenteClass, id);
        } finally {
            em.close();
        }
    }

    @Override
    public void excluir(T entity) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            T entityMerged = em.merge(entity);
            em.remove(entityMerged);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public List<T> buscarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            String jpql = "SELECT e FROM " + persistenteClass.getSimpleName() + " e";
            return em.createQuery(jpql, persistenteClass).getResultList();
        } finally {
            em.close();
        }
    }
}