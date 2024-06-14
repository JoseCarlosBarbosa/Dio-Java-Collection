package Tarefas.List.CarrinhodeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompas {
    public List<Item> itensList;
    private Double valorTotal= 0.0 ;


    public CarrinhoDeCompas(){
        this.itensList = new ArrayList<>();
    }

    public void adicionarItens(String nome, Double preco, Integer quantidade){
        itensList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for (Item item : itensList) {
            if(item.getNome().equalsIgnoreCase(nome)){
                itemRemover.add(item);
            }
        }
        itensList.removeAll(itemRemover);
    }

    public Double calcularValorTotal(){
        for (Item item : itensList) {
            valorTotal += item.getPreco();
        }
        return valorTotal;
    }
    public void exibirItens(){
        System.out.println(itensList);
    }
}
