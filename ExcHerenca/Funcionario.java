package ExcHerenca;

public class Funcionario {

    private String nome;
    private String cpf;
    private Double salario;
    
    Funcionario(String nome, String cpf, Double salario){

        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;

    }
    public void setNomeFunc(String nome){
        this.nome = nome;
    }
    public String getNomeFunc(){
        return "Nome: "+ nome + "\n";
    }

    public void setCpfFunc(String cpf){
        this.cpf = cpf;
    }
    public String getCpfFunc(){
        return "CPF: " + cpf + "\n";
    }

    public void setSalarioFunc(Double salario){
        this.salario = salario;
    }
    public Double getSalarioFunc(){
        return salario; 
    }

    @Override
    public String toString(){
        return getNomeFunc() + getCpfFunc() + "Salário: " + getSalarioFunc() + "\n";
    }
}
