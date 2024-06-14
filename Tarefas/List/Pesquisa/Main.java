package Tarefas.List.Pesquisa;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("livro 1", "autor 1", 2015);
        catalogoLivros.adicionarLivro("livro 2", "autor 2", 2010);
        catalogoLivros.adicionarLivro("livro 3", "autor 2", 2012);
        catalogoLivros.adicionarLivro("livro 5", "autor 3", 2019);
        catalogoLivros.adicionarLivro("livro 4", "autor 4", 2017);

        //System.out.println(catalogoLivros.pesquisarPorAutor("autor 2"));

        // System.out.println(catalogoLivros.pesquisarPorIntervaloDeAnos(2012, 2015));

        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 3"));
    }
}
