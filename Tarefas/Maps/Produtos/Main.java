package Maps.Produtos;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "prod1", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "prod2", 5, 3.0);
        estoqueProdutos.adicionarProduto(3L, "prod3", 2, 10.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("valor total do estoque R$ "+ estoqueProdutos.valorTotalEstoque());
        System.out.println("produto mais Caro" + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("produto mais Barato" + estoqueProdutos.obterProdutoMaisBarato());
    }
}
