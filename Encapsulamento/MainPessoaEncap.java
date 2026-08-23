import java.util.Scanner;

public class MainPessoaEncap{

    public static Scanner scan = new Scanner(System.in);
    public static final int TAM = 5;
    public static void main(String []args){
        Pessoa p = new Pessoa("Marcos", 21);
        Pessoa p2[] = new Pessoa[TAM];
        

        System.out.printf("\n Meu nome é { %s } \nSua idade é { %d } ", p.getNome(), p.getIdade());

        for(int i = 0 ; i < 3; i +=1){

            System.out.printf("\n Nome %d : ", i);
            String n = scan.nextLine();
            
            
            System.out.printf("\n Idade %d :", i);
            int idade = scan.nextInt();

            scan.nextLine();

            p2[i] = new Pessoa(n, idade);

        }

        public void PrintPessoa(int TAm){
            for(int i = 0; i < TAM ; i+= 1){

                System.out.printf("====Pessoa %d====",i);



            }
        }
        System.out.printf("\nIdade da pessoa 2 { %d } e o nome { %s }",p2[0].getIdade(), p2[0].getNome());
        System.out.printf("\nIdade da pessoa 2 { %d } e o nome { %s }",p2[2].getIdade(), p2[2].getNome());
        System.out.printf("\nIdade da pessoa 2 { %d } e o nome { %s }",p2[1].getIdade(), p2[1].getNome());

        


    }
}