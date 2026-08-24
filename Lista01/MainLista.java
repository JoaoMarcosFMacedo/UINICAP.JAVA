package Lista01;

public class MainLista {
    
    public static void main(String[] args) {
        
        Filme f1 = new Filme("Deu a Louca na Chapeuzinho", "Animação", 2005);
        Filme f2 = new Filme("O Auto da Compadecida", "Comédia", 2004);

        Autor au = new Autor("George Orwell","Britânico");
        Autor au2 = new Autor("Roberto Carlos","Brasileiro");

        Livro lr = new Livro("1984", 1949, au);
        Livro lr2 = new Livro("Dom Casmurro", 1899, au2);
        
        
        System.out.printf("\n ---------- Filme 01 ---------- \nTítlo - %s \nGênero - %S \nAno de Lançamento - %d",f1.titulo, f1.genero, f1.anoLancamento );
        System.out.printf("\n\n ---------- Filme 02 ---------- \nTítlo - %s \nGênero - %S \nAno de Lançamento - %d",f2.titulo, f2.genero, f2.anoLancamento );
        
        System.out.println("\n\n=================================================\n\n");
        
        // au.sys();
        
        // au2.sys();
        
        lr.sys();
        
        System.out.println("\n\n=================================================\n\n");

        lr2.sys();
    }
    
}
