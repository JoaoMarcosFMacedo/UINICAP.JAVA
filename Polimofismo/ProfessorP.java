package Polimofismo;

public class ProfessorP extends PessoaP {

    private String discpl;

    ProfessorP(String nome, int idade, String discpl ){
        super(nome, idade);
        this.discpl = discpl;
    }
    public void setDiscpl(String discpl){
        this.discpl = discpl;
    }
    public String getNome(){
        return discpl;
    }
}
