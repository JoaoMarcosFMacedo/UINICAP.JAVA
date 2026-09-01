public class ClientePF extends ClienteH{
    private String cpf;

    public ClientePF(String nome, String endereco, String cpf){
        super(nome, endereco);
        this.cpf = cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    @Override
    public String toString(){
        return 
            "Nome { " + this.getNome() + " }\n" +
            "Endereço {" + this.getEndereco() + "}\n" +
            "CPF { " + this.getCpf() + " } \n";
    }
}
