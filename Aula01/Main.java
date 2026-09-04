
public class Main{
    public static void main(String [] args){


        PessoaA p = new PessoaA("Marcos",20, "54545", 40 );
        PessoaA p2 = new PessoaA("Marcodsad" , 660, "0684654", 500);

        System.out.printf("\nNome: %s, \nidade: %d \nCPF { %s } \n km andado %d",p.nome, p.idade, p.cpf, p.dist);

        System.out.printf("\n==========================================================================");

        System.out.printf("\nNome: %s, \nidade: %d \nCPF { %s } \n km andado %d ", p2.nome, p2.idade, p2.cpf, p2.Andar());


    }
}