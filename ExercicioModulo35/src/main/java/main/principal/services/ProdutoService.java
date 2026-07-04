package main.principal.services;

import main.principal.dao.IProdutoDAO;
import main.principal.domain.Produto;
import java.util.List;

public class ProdutoService implements IProdutoService {
    private IProdutoDAO produtoDAO;
    public ProdutoService(IProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }
    @Override
    public Produto cadastrar(Produto produto) {
        return produtoDAO.cadastrar(produto);
    }
    @Override
    public Produto alterar(Produto produto) {
        return produtoDAO.alterar(produto);
    }
    @Override
    public Produto consultar(Long id) {
        return produtoDAO.consultar(id);
    }
    @Override
    public void excluir(Produto produto) {
        produtoDAO.excluir(produto);
    }
    @Override
    public List<Produto> buscarTodos() {
        return produtoDAO.buscarTodos();
    }
}