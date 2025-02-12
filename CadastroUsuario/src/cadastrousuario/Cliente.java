/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrousuario;

public class Cliente {
    private String nome;
    private String idade;
    private String cidade;
    private String cpf;
    
    public Cliente(String nome,String idade,String cidade,String cpf)
    {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCpf() {
        return cpf;
    }
    //setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String ToString()
    {
        return "nome: "+this.nome+
        ",idade: "+this.idade+
        ",cidade: "+this.cidade+
        ",CPF: "+this.cpf;
    }
    
    
}
