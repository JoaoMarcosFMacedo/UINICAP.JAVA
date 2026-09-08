package Polimofismo;

public class PessoaP{

    private String nome;
    private int idade;

    PessoaP (String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
       

}