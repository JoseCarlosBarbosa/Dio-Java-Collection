package Tarefas.Set.Convite;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();



        conjuntoConvidados.adicionarConvidado("Pedro 1", 1);
        conjuntoConvidados.adicionarConvidado("Pedro 2", 2);
        conjuntoConvidados.adicionarConvidado("Pedro 3", 3);
        conjuntoConvidados.adicionarConvidado("Pedro 4", 4);
        conjuntoConvidados.adicionarConvidado("Pedro 5", 4);

        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() +" dentro do Set de Convidados");
        //conjuntoConvidados.removerConvidadoPorCod(5);
       conjuntoConvidados.exibirConvidados();
    }
}
