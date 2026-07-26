package br.com.teste.ExercicioModulo40;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteControle {

    @GetMapping("/ola")
    public String dizerOla() {
        return "Ola mundo!";
    }
}