public class Pessoa{
    int idade;
    String nome;
    String cpf;
    int dist;

    Pessoa(String nome,int idade, String cpf, int dist){

        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.dist = dist;

    }
    Pessoa(int i, String n, String c){

        idade = i;
        nome = n;
        cpf = c;
        dist = 0;
    }

    void andar( int d){
        dist = dist + d;
        System.out.printf("andou %d km", dist);
        
    }
    void dormiu(){
        System.out.printf("\n dormiu");
    }
    void aniver(){
        idade = idade + 1;
    }
}