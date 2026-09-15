package Polimofismo;

import java.util.ArrayList;

public class TurmaP {
    private String nomeTurma;
    private ArrayList<PessoaP> integrantes;
    //isso é uma loucura 

    TurmaP(String nomeTurma){
        this.nomeTurma = nomeTurma;
        this.integrantes = new ArrayList<>();

    }
    public void setNomeTurma(String nomeTurma){
        this.nomeTurma = nomeTurma;
    }
    public String getNomeTurma(){
        return nomeTurma;
    }
    
}
