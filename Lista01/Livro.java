package Lista01;

public class Livro {
    
    String titulo;
    int anoLancamento;
    Autor autor;

    Livro(String titulo, int anoLancamento, Autor autor){
        
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.autor = autor;

    }
    @Override
    public String toString(){

        return "Autor { " + autor.nome+ " } \nNacionalidade { "+ autor.nacio  + " } \nAno de Publicação { " + anoLancamento + " } \nTitulo { " + titulo + " }";
    }
    public void sys(){
        System.out.println(this);
    }

}
