package Polimofismo;

public class CoordenadorP extends PessoaP {
    
    private String setor;

    CoordenadorP(String nome, int idade, String setor){
        super(nome, idade);
    }
    public void setSetor(String setor){
        this.setor = setor;
    }
    public String getSetor(){
        return setor;
    }
}
