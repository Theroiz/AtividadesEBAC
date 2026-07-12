package main;

import org.apache.commons.lang3.StringUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Iniciando Teste de Importação Maven ===");

        String textoOriginal = "testando o import do maven no acer nitro";
        
        String textoCapitalizado = StringUtils.capitalize(textoOriginal);
        
        System.out.println("\n[Teste 1 - Apache Commons Lang3]");
        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto com capitalização: " + textoCapitalizado);

        Map<String, Object> dadosGamer = new HashMap<>();
        dadosGamer.put("setup", "Acer Nitro 5");
        dadosGamer.put("processador", "Ryzen 7");
        dadosGamer.put("memoria_ram_gb (cara)", 16);
        dadosGamer.put("status_importacao", "Sucesso Absoluto!");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonResultado = gson.toJson(dadosGamer);
        System.out.println("\nObjeto Java convertido para JSON");
        System.out.println(jsonResultado);
        System.out.println("\n==========================================");
    }
}