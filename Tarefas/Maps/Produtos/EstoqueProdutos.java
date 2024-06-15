package Maps.Produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double valorTotalEstoque(){
        double valorTotalEstoque= 0;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto prod : estoqueProdutosMap.values()) {
                valorTotalEstoque += prod.getQuantidade() * prod.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto valorMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto prod : estoqueProdutosMap.values()) {
                if(prod.getPreco() > maiorPreco){
                    valorMaisCaro = prod;
                }
            }
        }
        return valorMaisCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto valorMaisBarato = null;
        double menorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto prod : estoqueProdutosMap.values()) {
                if(prod.getPreco() < menorPreco){
                    valorMaisBarato = prod;
                }
            }
        }
        return valorMaisBarato;
    }


}
