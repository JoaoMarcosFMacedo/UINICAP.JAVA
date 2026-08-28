public class Departamento {

    private int idDepart;
    private String nomeDepart;
    
    Departamento(int idDepart,String nomeDepart){

        setId(idDepart);
        // this.idDepart = idDepart;

        // this.nomeDepart = nomeDepart;
        
    }

    public void setId(int idDepart){
        if(idDepart < 0){
            System.out.print("Não pode Man, quem que ser maior que zero!");
        }else{
            this.idDepart = idDepart;
        }
    }
    public void setNome(String nomeDepart){

    }
    
}
