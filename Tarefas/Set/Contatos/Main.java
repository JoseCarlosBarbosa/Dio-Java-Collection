package Tarefas.Set.Contatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

       

        agendaContatos.adicionarContato("Antonio", 15);
        agendaContatos.adicionarContato("pedro 2", 16);
        agendaContatos.adicionarContato("marcia 3", 17);
        agendaContatos.adicionarContato("Antonio", 18);
       
       System.out.println("\nContato Atualizado: " + agendaContatos.atualizarNumeroContato("marcia", 19));
        agendaContatos.exibitContato();
        System.out.println("\n pesquisa por nome"+ agendaContatos.pesquisarPorNome("marcia"));
        
        System.out.println("\n\n" + agendaContatos.exibirContatosOrdenados());
    }
}   
