package Polimofismo;

public class AlunoP extends PessoaP {
    
    private Double media;

    AlunoP(String nome, int idade, Double media){
        super(nome, idade);
        this.media = media;
    }

    public void setMedia(Double media){
        this.media = media;
    }
    public Double getMedia(){
        return media;
    }
    public boolean PassouMedia(int media){
        return media >= 7;
    }
}
