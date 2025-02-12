
package cadastrousuario;

import java.util.ArrayList;


public class CadastroUsuario {

    public static void main(String[] args) {
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }
    
    public boolean isCadastrado(ArrayList<Cliente> itens)
    {
        for (int i = 0; i < itens.size(); i++) {
        for (int j = i + 1; j < itens.size(); j++) {
            if (itens.get(i).equals(itens.get(j))) { // Comparando os itens
                return true; // Encontrou duplicata
            }
        }
    }
    return false;
    }
    
}
