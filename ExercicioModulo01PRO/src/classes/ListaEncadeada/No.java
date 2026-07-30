package classes.ListaEncadeada;

public class No {
    String nome;
    No proximoNo;

    public No(String nome) {
        this.nome = nome;
        this.proximoNo = null;
    }
}

// tempo: O(1), Espaço: O(1)