public class MainHeranca {
    

    public static void main(String []args ){
        ClientePF cpf = new ClientePF("Marcos","Rua das Pedras","013.321.684.69");
        
        ClientePJ cnpj = new ClientePJ("João","Rua das Flores", "55555555555555");

        System.out.println(cnpj);
        System.out.println();
        System.out.println(cpf);
       
    }
}
