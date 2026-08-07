package heitor.enan.silva.projetoabrigo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/animais")
public class AnimalController {

    private final AnimalRepository repository;

    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/resgates-por-funcionario")
    public ResponseEntity<?> relatorioResgates(
            @RequestParam LocalDate dataInicio,
            @RequestParam LocalDate dataFim) {

        // Regra: O intervalo máximo das datas é de um ano.
        if (dataInicio.plusYears(1).isBefore(dataFim)) {
            return ResponseEntity.badRequest().body("O intervalo máximo das datas não pode ultrapassar 1 ano.");
        }

        List<FuncionarioResgateDTO> relatorio = repository.contarResgatesPorFuncionario(dataInicio, dataFim);
        return ResponseEntity.ok(relatorio);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Animal cadastrarAnimal(@RequestBody Animal animal) {
        return repository.save(animal);
    }

    @GetMapping("/nao-adotados")
    public List<Animal> listarNaoAdotados(@RequestParam(required = false) String especie) {
        if (especie != null) {
            return repository.findByDataAdocaoIsNullAndEspecieOrderByDataEntradaAsc(especie);
        }
        return repository.findByDataAdocaoIsNullOrderByDataEntradaAsc();
    }

    @GetMapping("/adotados")
    public List<Animal> listarAdotados() {
        return repository.findByDataAdocaoIsNotNull();
    }
}