public class ClienteMain{
    public static void main(String[]args){
        Telefone tele = new Telefone(81, 54165465);
        Endereco endeco = new Endereco("Rua professor ral", 560, "Rindasda", "Rellcife", "PE" );
        Data date = new Data(16,2,2066);
        Cliente2 clnt = new Cliente2("Marcps", "0505022","050512", date, endeco, tele );

        
        System.out.print(clnt.data.mes);


    }
}