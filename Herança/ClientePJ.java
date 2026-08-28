public class ClientePJ extends Cliente{
    
    private String cnpj;

    ClientePJ(String nome, String endereco, String cnpj){
        super(nome, endereco);
        this.cnpj = cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getCnpj(){
        return cnpj;
    }
    @Override
    public String toString(){
        return 
            "Nome { " + this.getNome() + " }\n" +
            "Endereço {" + this.getEndereco() + "}\n" +
            "CPF { " + this.getCnpj() + " } \n";
    }
}
