package classes.ListaEncadeada;
public class ListaEncadeada{
    
    private No cabeca;
    private int tamanho;

    public ListaEncadeada() {//ignorado
        this.cabeca = null;
        this.tamanho = 0;
    }
    public int size() {//Tempo: O(1),Espaço: O(1) (definição simples)
        return this.tamanho;
    }
    public void push(No novoNo) {//Tempo: O(n)(é necessario percorrer o while que pode ter tamanho variado), Espaço: O(1)(espaço dinamico porem pequeno)
        if (this.cabeca == null) {
            this.cabeca = novoNo;
        } else {
            No atual = this.cabeca;
            
            while (atual.proximoNo != null) {
                atual = atual.proximoNo;
            }
            atual.proximoNo = novoNo;
        }
        this.tamanho++;
    }


    public No pop() {//Tempo: O(1), Espaço: O(1) (definição e logica basica)
        if (this.cabeca == null) {
            return null; 
        }

        if (this.cabeca.proximoNo == null) {
            No removido = this.cabeca;
            this.cabeca = null;
            this.tamanho--;
            return removido;
        }

        No atual = this.cabeca;
        while (atual.proximoNo.proximoNo != null) {
            atual = atual.proximoNo;
        }

        No removido = atual.proximoNo;
        atual.proximoNo = null; 
        
        this.tamanho--;
        return removido;
    }
    public No elementAt(int index) {//Tempo: O(n)(tempo pode variar dependendo do tamanho), O(1)
        if (index < 0 || index >= this.tamanho) {
            return null; 
        }

        No atual = this.cabeca;
        for (int i = 0; i < index; i++) {
            atual = atual.proximoNo;
        }
        
        return atual;
    }

    public void insert(int index, No novoNo) {//Tempo: O(n), Espaço: O(1)
        if (index < 0 || index > this.tamanho) return;
        if (index == 0) {
            novoNo.proximoNo = this.cabeca; 
            this.cabeca = novoNo;        
        } else {
            No anterior = elementAt(index - 1);
            
            novoNo.proximoNo = anterior.proximoNo; 
            anterior.proximoNo = novoNo; 
        }
        this.tamanho++;
    }
    public void remove(int index) {//Tempo: O(n), Espaço: O(1)
        if (index < 0 || index >= this.tamanho) return;


        if (index == 0) {
            this.cabeca = this.cabeca.proximoNo; 
        } else {
            No anterior = elementAt(index - 1);
            anterior.proximoNo = anterior.proximoNo.proximoNo;
        }
        this.tamanho--;
    }
    public void printList() {//Tempo: O(n), Espaço: O(1)
        No atual = this.cabeca;
        System.out.print("Lista: [ ");
        
        while (atual != null) {
            System.out.print(atual.nome + " -> ");
            atual = atual.proximoNo;
        }
        
        System.out.println("null ]  |  Tamanho: " + this.tamanho);
    }
}