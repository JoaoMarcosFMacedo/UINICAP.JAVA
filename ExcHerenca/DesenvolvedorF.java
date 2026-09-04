package ExcHerenca;

public class DesenvolvedorF extends Funcionario {

    private String linguagemP;

    DesenvolvedorF( String nome, String cpf, Double salario, String linguagemP){
        
        super(nome, cpf, salario);
        this.linguagemP = linguagemP;

    }
    public void setLinguagem(String linguagemP){
        this.linguagemP = linguagemP;
    }
    public String getLinguagem(){
        return "Linguagem Principal: " + this.linguagemP;
    }
    @Override
    public String toString(){
        return super.toString() + getLinguagem();
    }
}
