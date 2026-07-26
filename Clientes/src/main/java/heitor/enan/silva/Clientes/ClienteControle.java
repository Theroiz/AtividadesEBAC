package heitor.enan.silva.Clientes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/clientes")
public class ClienteControle {

    @GetMapping("/{nome}")
    public String verClienteEProdutos(@PathVariable String nome) {
        RestTemplate restTemplate = new RestTemplate();

        String urlProdutos = "http://localhost:8081/produtos";
        String listaDeProdutos = restTemplate.getForObject(urlProdutos, String.class);

        return "Cliente: " + nome + " | Sugestões de compra: " + listaDeProdutos;
    }
}