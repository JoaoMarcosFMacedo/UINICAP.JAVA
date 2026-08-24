package Lista01;

public class Autor {

    String nome;
    String nacio;

    Autor(String nome, String nacio){

        this.nome = nome;
        this.nacio = nacio;
        
    }
    @Override
    public String toString(){

        return "Nome {" + nome +" }\nNacionalidade {" + nacio +"}";
        
    }
    public void sys(){
        System.out.println(this);
    }
}
