package pacotePrincipal;
public class ClassePrincipal {

    public static void main(String[] args) {
        //fatorialrecursivo
        System.out.println("   TESTANDO FATORIAL RECURSIVO   ");
        System.out.println("---------------------------------");
        System.out.println("Fatorial de 3: " + FatorialRecursivo.calcular(3));
        System.out.println("Fatorial de 7: " + FatorialRecursivo.calcular(7));
        System.out.println("Fatorial de 100: " + FatorialRecursivo.calcular(100));
        //topdown
        System.out.println(" TESTANDO TOP-DOWN ");
        System.out.println("--------------------");
        System.out.println("Fatorial de 3: " + FatorialTopDown.calcular(3));
        System.out.println("Fatorial de 7: " + FatorialTopDown.calcular(7));
        System.out.println("Fatorial de 100: " + FatorialTopDown.calcular(100));
        System.out.println("Fatorial de 101: " + FatorialTopDown.calcular(101));
        //bottomup
        System.out.println(" TESTANDO BOTTOM-UP ");
        System.out.println("---------------------");
        System.out.println("Fatorial de 3: " + FatorialBottomUp.calcular(3));
        System.out.println("Fatorial de 7: " + FatorialBottomUp.calcular(7));
        System.out.println("Fatorial de 100: " + FatorialBottomUp.calcular(100));
    }
}