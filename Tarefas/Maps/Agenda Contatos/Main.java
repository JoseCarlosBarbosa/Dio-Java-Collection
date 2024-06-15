public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("camila", 1);
        agendaContatos.adicionarContato("camila 1", 2);
        agendaContatos.adicionarContato("camila 2", 3);
        agendaContatos.adicionarContato("camila 3", 4);
        agendaContatos.adicionarContato("camila 4", 5);
        agendaContatos.adicionarContato("camila 5", 6);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("camila");
        agendaContatos.exibirContatos();

        System.out.println("o numero é: " + agendaContatos.pesquisarPorNome("camila"));
    }
}
