import java.util.Scanner;

public class MainPessoaEncap{

    public static Scanner scan = new Scanner(System.in);
    public static final int TAM = 5;
    public static void main(String []args){
        PessoaA p = new Pessoa("Marcos", 21);
        PessoaA p2[] = new PessoaA[TAM];
        

        System.out.printf("\n Meu nome é { %s } \nSua idade é { %d } ", p.getNome(), p.getIdade());

        for(int i = 0 ; i < TAM; i +=1){

            System.out.printf("\n Nome %d : ", i);
            String n = scan.nextLine();
            
            
            System.out.printf("\n Idade %d :", i);
            int idade = scan.nextInt();

            scan.nextLine();

            p2[i] = new PessoaA(n, idade);

                        
        }
        printPessoa(p2, TAM);

        // System.out.printf("\nIdade da pessoa 2 { %d } e o nome { %s }",p2[0].getIdade(), p2[0].getNome());
        // System.out.printf("\nIdade da pessoa 2 { %d } e o nome { %s }",p2[2].getIdade(), p2[2].getNome());
        // System.out.printf("\nIdade da pessoa 2 { %d } e o nome { %s }",p2[1].getIdade(), p2[1].getNome());
                
    }

    public static void printPessoa(PessoaA[] p, int tam){

        for(int i = 0; i < tam ; i+= 1){

            System.out.printf("\n====Pessoa %d====",i);

            System.out.printf("\n Nome: %s \nidade: %d",p[i].getNome(), p[1].getIdade());
            
        }
    }
}