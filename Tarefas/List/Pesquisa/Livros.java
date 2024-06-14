package Tarefas.List.Pesquisa;

public class Livros {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livros (String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    @Override
    public String toString() {
        return "Livro{ " + " titulo: " + titulo + " autor:"+ autor + " Ano Publicado: "+ anoPublicacao+'}';
    }
}
