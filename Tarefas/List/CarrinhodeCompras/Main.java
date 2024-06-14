package Tarefas.List.CarrinhodeCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompas carrinhoDeCompas = new CarrinhoDeCompas();
        carrinhoDeCompas.adicionarItens("Chiclete", 15.5, 1);
        carrinhoDeCompas.adicionarItens("sapato", 15.0, 2);
        carrinhoDeCompas.calcularValorTotal();
        carrinhoDeCompas.exibirItens();
        carrinhoDeCompas.removerItem("sapato");
        carrinhoDeCompas.exibirItens();
    }
}
