package main.principal.dao.generic;

import java.util.List;
public interface IGenericDAO<T, E> {
    T cadastrar(T entity);
    T alterar(T entity);
    T consultar(E id);
    void excluir(T entity);
    List<T> buscarTodos();
}