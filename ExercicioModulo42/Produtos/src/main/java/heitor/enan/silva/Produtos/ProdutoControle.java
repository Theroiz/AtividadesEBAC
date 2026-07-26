package heitor.enan.silva.Produtos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoControle {

    @GetMapping
    public List<String> listarProdutos() {
        return Arrays.asList("Acer Nitro 5 AN515-44", "Mouse Logitech G203", "Headset Havit H2002d");
    }
}