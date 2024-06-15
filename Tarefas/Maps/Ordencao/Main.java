package Maps.Ordencao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        
        agendaEventos.adicionarEventos(LocalDate.of(2022, 5, 15), "show 1", "cantor 1");
        agendaEventos.adicionarEventos(LocalDate.of(2022, 4, 1), "show 2", "cantor 2");
        agendaEventos.adicionarEventos(LocalDate.of(2022, 7, 10), "show 3", "cantor 3");
        agendaEventos.adicionarEventos(LocalDate.of(2025, 7, 10), "show 3", "cantor 3");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
