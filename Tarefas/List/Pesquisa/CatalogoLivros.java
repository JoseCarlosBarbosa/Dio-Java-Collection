package Tarefas.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livros> listLivros;

    public CatalogoLivros (){
        this.listLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listLivros.add(new Livros(titulo, autor, anoPublicacao));
    }

    public List<Livros> pesquisarPorAutor(String titulo){
        List<Livros> livrosPorAutor = new ArrayList<>();
        //verifica se a lista está vazia
        if(!listLivros.isEmpty()){
            // busca na lista de livro os autores
            for (Livros l : listLivros) {
                if(l.getAutor().equalsIgnoreCase(titulo)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livros> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livros> livrosPorIntervalo = new ArrayList<>();
        if(!listLivros.isEmpty()){
            for (Livros livros : listLivros) {
                if(livros.getAnoPublicacao() >= anoInicial && livros.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(livros);
                }
            }
        }
        return livrosPorIntervalo;
    }

    public Livros pesquisarPorTitulo(String tituloPesquisado){
        Livros livrosPorTitulo = null;
        if(!listLivros.isEmpty()){
            for (Livros L : listLivros) {
                if(L.getTitulo().equalsIgnoreCase(tituloPesquisado)){
                    livrosPorTitulo = L;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    } 

}
