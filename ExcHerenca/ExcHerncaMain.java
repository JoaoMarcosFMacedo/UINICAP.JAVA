package ExcHerenca;

public class ExcHerncaMain {
    
    
    public static void main(String []args){

        Funcionario fun01 = new Funcionario("Marcos", "087.456.782-86", 1000.00);
        GerenteF ger01 = new GerenteF("Marcos", "087.456.782-86", 1000.00 , "Geral");
        DesenvolvedorF desenF = new DesenvolvedorF("Marcos Desenvolvedor", "799.498.546-40", 2660.00,"Java");


        System.out.print(fun01);

        System.out.println("=====================================");
        System.out.print(ger01);

        System.out.println("=====================================");
        
        System.out.print(desenF);

    }


}
