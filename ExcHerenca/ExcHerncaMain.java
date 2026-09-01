package ExcHerenca;

public class ExcHerncaMain {
    
    
    public static void main(String []args){

        Funcionario fun01 = new Funcionario("Marcos", "087.456.782-86", 100000000.00);
        GerenteF ger01 = new GerenteF("Marcos", "087.456.782-86", 100000000.00 , "Logistica");


        System.out.print(fun01);

        System.out.println("=====================================");

        System.out.print(ger01);
        


    }


}
