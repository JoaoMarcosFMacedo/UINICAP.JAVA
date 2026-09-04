public class PessoaA{
    int idade;
    String nome;
    String cpf;
    int dist;

    PessoaA(String nome,int idade, String cpf, int dist){

        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.dist = dist;

    }
   

    public int Andar(){
        return dist * 2;  
    }
    public void Dormiu(){
        System.out.printf("\n dormiu");
    }
    public void aniver(){
        idade = idade + 1;
    }
}