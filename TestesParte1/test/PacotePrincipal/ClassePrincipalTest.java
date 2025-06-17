package PacotePrincipal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ClassePrincipalTest {
    @Test
    public void testeClasse()
    {
       ClassePrincipal cp = new ClassePrincipal();
       cp.processamento();
       boolean verificando = cp.getLista().stream().allMatch(item -> item.toString().endsWith("a"));//eu nao tinha em mente outra forma de verificar se o nome era feminino (descartando reutilizar o -genero)
       assertTrue(verificando,"nao contem nomes femininos");
    }
}