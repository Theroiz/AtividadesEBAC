package Principal;

public interface iCarros<T,E> {
    public void acelerar();
    public void parar();
    public T getCor();
    public E getAno();
    public void setCor(T cor);
    public void setAno(E ano);
}