package Tarefas.Set.Contatos;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AgendaContatos {
    private Set<Contatos> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatosSet.add( new Contatos(nome, numero));
    }

    public void exibitContato (){
        System.out.println(contatosSet);
    }

     // organizar por nome com comparator 
    public Set<Contatos> exibirContatosOrdenados(){
        Set<Contatos> contatosPorNome = new TreeSet<>(contatosSet);
        return contatosPorNome;
        
    }

    public Set<Contatos> pesquisarPorNome(String nome){
        Set<Contatos> contatosPesquisar = new HashSet<>();
        for (Contatos contatos : contatosSet) {
            // metodo que busca qualquer nome não somente um
            if(contatos.getNome().startsWith(nome)){
                contatosPesquisar.add(contatos);
            }
        }
        return contatosPesquisar;
    }




    public Contatos atualizarNumeroContato(String nome, int novoNumero){
        Contatos contatoAtualizar = null;
        for (Contatos contatos : contatosSet) {
            if(contatos.getNome().equalsIgnoreCase(nome)){
                contatos.setNumero(novoNumero);
                contatoAtualizar = contatos;
                break;
            }
        }
        return contatoAtualizar;
    }
}


