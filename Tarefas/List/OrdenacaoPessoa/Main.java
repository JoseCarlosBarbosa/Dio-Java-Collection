package Tarefas.List.OrdenacaoPessoa;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("nome 1", 20, 1.85);
        ordenacaoPessoa.adicionarPessoa("nome 2", 30, 1.55);
        ordenacaoPessoa.adicionarPessoa("nome 3", 40, 1.65);
        ordenacaoPessoa.adicionarPessoa("nome 4", 17, 1.75);

        System.out.println(ordenacaoPessoa.ordenadoPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());


    }
}
