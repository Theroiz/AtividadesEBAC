package main.principal.services;

import main.principal.domain.Produto;
import java.util.List;

public interface IProdutoService {
    Produto cadastrar(Produto produto);
    Produto alterar(Produto produto);
    Produto consultar(Long id);
    void excluir(Produto produto);
    List<Produto> buscarTodos();
}