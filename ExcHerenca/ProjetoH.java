package ExcHerenca;

public class ProjetoH {
    
    private String nome;
    private String descricao;

    private DesenvolvedorF desenvolvedorF;


    ProjetoH(String nome, String descricao, DesenvolvedorF desenvolvedorF){

        this.nome = nome;
        this.descricao = descricao;

        this.desenvolvedorF = desenvolvedorF;

    }

    public void setNomeP(String nome){
        this.nome = nome;
    }
    public String getNomeProj(){
        return "\n Nome do projeto: " + nome;
    }
    public void setDescricaoP(String descricao){
        this.descricao = descricao;
    }
    public String getDescriP(){
        return "\n Decrição: " + descricao;
    }
    public void setDev(DesenvolvedorF desenvolvedorF){
        this.desenvolvedorF = desenvolvedorF;
    }
    public String getDev(){
        return "\n Decrição: " + desenvolvedorF;
    }
    @Override
    public String toString(){
        return getNomeProj() + getDescriP(); 
    }



}
