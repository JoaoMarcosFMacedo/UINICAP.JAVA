
public class Main{
    public static void main(String [] args){


        Pessoa p = new Pessoa("Marcos", 20 );
        Pessoa p2 = new Pessoa("Nome", 660);

        System.out.printf("\nNome: %s, \nidade: %d \nCPF { %s } \n km andado %d",p.nome, p.idade, p.cpf, p.dist);

        System.out.printf("\n==========================================================================");

        System.out.printf("\nNome: %s, \nidade: %d \nCPF { %s } \n km andado %d",p2.nome, p2.idade, p2.andar());


    }
}