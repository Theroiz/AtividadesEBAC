package main.principal.services.generic;

import java.util.List;

public interface IGenericService<T, E> {
    T cadastrar(T entity);
    T alterar(T entity);
    T consultar(E id);
    void excluir(T entity);
    List<T> buscarTodos();
}