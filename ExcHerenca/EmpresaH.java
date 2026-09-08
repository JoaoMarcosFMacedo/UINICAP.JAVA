package ExcHerenca;

import java.util.ArrayList;

public class EmpresaH {
    
    private GerenteF gerenteF;
    private ArrayList<ProjetoH> projetos;

    EmpresaH(GerenteF gerenteF){
        this.gerenteF = gerenteF;
        this.projetos = new ArrayList<>();
    }
    EmpresaH(GerenteF gerenteF, ArrayList<ProjetoH> projetos){
        this.gerenteF = gerenteF;
        this.projetos = projetos;
    }
    public void setGerenteH(GerenteF gerenteF){
        this.gerenteF = gerenteF;
    }
    public String getGerenteH(){
        return "Gerente: " + gerenteF;
    }
    public ArrayList<ProjetoH> getProjeto(){
        return projetos;
    }
    public void addProjeto(ProjetoH projetoH){
        projetos.add(projetoH);
    }
}
