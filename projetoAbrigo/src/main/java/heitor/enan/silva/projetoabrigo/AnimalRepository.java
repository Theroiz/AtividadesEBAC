package heitor.enan.silva.projetoabrigo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDate;
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findByDataAdocaoIsNullOrderByDataEntradaAsc();
    List<Animal> findByDataAdocaoIsNullAndEspecieOrderByDataEntradaAsc(String especie);
    List<Animal> findByDataAdocaoIsNotNull();
    
    @Query("SELECT a.nomeRecebedor AS nomeRecebedor, COUNT(a) AS quantidade FROM Animal a WHERE a.dataEntrada BETWEEN :dataInicio AND :dataFim GROUP BY a.nomeRecebedor")
    List<FuncionarioResgateDTO> contarResgatesPorFuncionario(@Param("dataInicio") LocalDate dataInicio, @Param("dataFim") LocalDate dataFim);
}