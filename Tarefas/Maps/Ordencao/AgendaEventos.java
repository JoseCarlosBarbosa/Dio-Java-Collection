package Maps.Ordencao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){this.eventosMap = new HashMap<>();}

    public void adicionarEventos(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }
    // para ordenar trabalha com tree map
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap); // o tree map com o localdate ja organiza com a data
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
       /* Set<LocalDate> dataSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();*/ 

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);  //organiza ordem crescente
        for (Map.Entry<LocalDate,Evento> entry:eventoTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("proximo evento: "+ entry.getValue() + "sera: " +entry.getKey());
                break;
            }
        }

    }
}
