package main.principal.services.generic;

import main.principal.dao.generic.IGenericDAO;
import java.util.List;

public abstract class GenericService<T, E> implements IGenericService<T, E> {

    protected IGenericDAO<T, E> dao;
    public GenericService(IGenericDAO<T, E> dao) {
        this.dao = dao;
    }
    @Override
    public T cadastrar(T entity) {
        return this.dao.cadastrar(entity);
    }
    @Override
    public T alterar(T entity) {
        return this.dao.alterar(entity);
    }
    @Override
    public T consultar(E id) {
        return this.dao.consultar(id);
    }
    @Override
    public void excluir(T entity) {
        this.dao.excluir(entity);
    }
    @Override
    public List<T> buscarTodos() {
        return this.dao.buscarTodos();
    }
}