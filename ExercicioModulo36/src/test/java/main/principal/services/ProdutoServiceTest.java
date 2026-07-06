package main.principal.services;

import main.principal.dao.IProdutoDAO;
import main.principal.domain.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;

@ExtendWith(MockitoExtension.class)
public class ProdutoServiceTest {

    @Mock
    private IProdutoDAO produtoDAOMock;
    @InjectMocks
    private ProdutoService produtoService;

    private Produto produtoFake;

    @BeforeEach
    public void setup() {
        produtoFake = new Produto();
        produtoFake.setId(1L);
        produtoFake.setCodigo("PROD-001");
        produtoFake.setNome("Notebook Acer Nitro 5");
        produtoFake.setDescricao("Notebook Gamer com Ryzen 7");
        produtoFake.setValor(new BigDecimal("4500.00"));
    }

    @Test
    public void deveCadastrarProdutoComSucesso() {
        Mockito.when(produtoDAOMock.cadastrar(any(Produto.class))).thenReturn(produtoFake);

        Produto produtoSalvo = produtoService.cadastrar(produtoFake);

        assertNotNull(produtoSalvo);
        assertEquals("Notebook Acer Nitro 5", produtoSalvo.getNome());
        assertEquals("PROD-001", produtoSalvo.getCodigo());
        
        Mockito.verify(produtoDAOMock, Mockito.times(1)).cadastrar(any(Produto.class));
    }
    @Test
    public void deveConsultarProdutoPorIdComSucesso() {
        Mockito.when(produtoDAOMock.consultar(anyLong())).thenReturn(produtoFake);

        Produto produtoEncontrado = produtoService.consultar(1L);

        assertNotNull(produtoEncontrado);
        assertEquals(1L, produtoEncontrado.getId());
        
        Mockito.verify(produtoDAOMock, Mockito.times(1)).consultar(1L);
    }
    @Test
    public void deveBuscarTodosOsProdutosComSucesso() {
        List<Produto> listaFake = Collections.singletonList(produtoFake);
        Mockito.when(produtoDAOMock.buscarTodos()).thenReturn(listaFake);

        List<Produto> produtos = produtoService.buscarTodos();

        assertNotNull(produtos);
        assertFalse(produtos.isEmpty());
        assertEquals(1, produtos.size());
        
        Mockito.verify(produtoDAOMock, Mockito.times(1)).buscarTodos();
    }
}