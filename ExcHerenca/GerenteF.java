package ExcHerenca;

public class GerenteF extends Funcionario {
    
    private String departamento;
    
    GerenteF(String nome, String cpf, Double salario, String departamento){
        
        super(nome, cpf, salario);
        
        this.departamento = departamento;
    }
    public void setDepartamentoGerent(String departamento){
        this.departamento = departamento;
    }
    public String getDepartamentoGerent(){
        return this.departamento;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" +
        "Departamento [ " + getDepartamentoGerent() + " ]\n";
    }
}
