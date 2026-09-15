public class PessoaEn{

    private String nome;
    private int idade;   

    PessoaEn(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }
    public String getNome(){
        return nome; 
    }

    public void setNome(String nome){ 
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        if( idade > 0 ){

            this.idade = idade;

        }else {
            System.out.printf("\n Idade inválida!");
        }
    }
}