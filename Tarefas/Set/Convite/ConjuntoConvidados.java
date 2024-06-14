package Tarefas.Set.Convite;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;


    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }
    

    public void adicionarConvidado(String nome, int cod){
        convidadosSet.add(new Convidado(nome, cod));
    }

    public void removerConvidadoPorCod(int cod){
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadosSet) {
            if(convidado.getCodConvite() == cod){
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }
}
