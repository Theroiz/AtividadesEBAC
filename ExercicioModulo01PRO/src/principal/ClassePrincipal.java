package principal;
import classes.FilaFIFO;
import classes.Pilha;
import classes.ListaEncadeada.ListaEncadeada;
import classes.ListaEncadeada.No;
public class ClassePrincipal {
public static void main(String[] args) {
        
        System.out.println("   teste de lista encadeada  ");
        ListaEncadeada lista = new ListaEncadeada();

        //teste de  push()
        lista.push(new No("Alice"));
        lista.push(new No("Bob"));
        lista.push(new No("Charlie"));
        System.out.println("Após 3 push():");
        lista.printList();

        //teste de insert()
        System.out.println("\nInserindo 'Daniel' no índice 1...");
        lista.insert(1, new No("Daniel"));
        lista.printList();

        // teste de elementAt()
        System.out.println("\nBuscando o elemento no índice 2...");
        No encontrado = lista.elementAt(2);
        if (encontrado != null) {
            System.out.println("Elemento no índice 2 encontrado com sucesso no endereço de memória: " + encontrado);
        }

        //teste remove()
        System.out.println("\nRemovendo elemento do índice 0...");
        lista.remove(0);
        lista.printList();

        //testando pop()
        System.out.println("\nRemovendo o último elemento (pop)...");
        No removido = lista.pop();
        if (removido != null) {
            System.out.println("Nó removido do final da lista com sucesso.");
        }
        lista.printList();

        System.out.println("       teste fila fifo      ");
        FilaFIFO fila = new FilaFIFO();

        //testando isEmpty()
        System.out.println("Fila começou vazia? " + fila.isEmpty());

        // teste de enqueue
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        System.out.println("3 elementos enfileirados: 10, 20, 30");

        //teste de size(), front() e rear()
        System.out.println("Tamanho atual da fila: " + fila.size());
        System.out.println("Frente da fila (primeiro a sair): " + fila.front());
        System.out.println("Fundo da fila (último a entrar): " + fila.rear());

        // teste de dequeue()
        System.out.println("\nExecutando dequeue() (remove o 10)...");
        fila.dequeue();
        System.out.println("Nova frente da fila: " + fila.front());
        System.out.println("Novo tamanho da fila: " + fila.size());


        System.out.println("   teste pilha   ");
        Pilha pilha = new Pilha();

        //teste isEmpty()
        System.out.println(pilha.isEmpty());

        //teste push()
        pilha.push(100);
        pilha.push(200);
        pilha.push(300);

        //teste de size() e top()
        System.out.println("Tamanho atual da pilha: " + pilha.size());
        System.out.println("Topo da pilha: " + pilha.top());

        //teste de pop()
        System.out.println("\nExecutando pop() (remove o 300)...");
        int desempilhado = pilha.pop();
        System.out.println("Valor removido (retorno do pop): " + desempilhado);
        System.out.println("Novo topo da pilha: " + pilha.top());
        System.out.println("Novo tamanho da pilha: " + pilha.size());
    }
}