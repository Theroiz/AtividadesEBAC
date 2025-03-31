package Principal;

public class Suv<T,E> implements iCarros<T,E> {
    private boolean isAndando = false;
    private T cor;
    private E ano;
    private String modelo = "SUV";
    public Suv(T cor,E ano)
    {
        this.cor = cor;
        this.ano = ano;
    }
    @Override
    public void acelerar() {
        this.isAndando = true;
    }

    @Override
    public void parar() {
        this.isAndando = false;
    }

    @Override
    public T getCor() {
        return this.cor;
    }

    @Override
    public E getAno() {
        return this.ano;
    }

    @Override
    public void setCor(T cor) {
        this.cor = cor;
    }

    @Override
    public void setAno(E ano) {
        this.ano = ano;
    }

    @Override
    public String toString()
    {
        return "Modelo do carro: "+modelo+"\nCor: "+this.cor+"\nAno: "+this.ano+"\n"+((isAndando)? "O carro está andando" : "O carro está parado");
    }
}