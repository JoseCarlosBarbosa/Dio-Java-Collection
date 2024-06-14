package Tarefas.List.CarrinhodeCompras;

public class Item {
    private String nome;
    private Double preco;
    private int quantidade;

    public Item (String nome, Double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome(){
        return nome;
    }
    public Double getPreco(){
        return preco;
    }
    public Integer getQuantida(){
        return quantidade;
    }

    public String toString(){
        
        return "nome: " + nome + "/ preco: "+ preco + "/ Quantidade: " + quantidade;
    }
}
