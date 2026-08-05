package br.edu.fatecpg.tecprogII.pedidosRestaurante.model;
import java.util.*;

public class Pedidos {
    private int numPedido;
    private List<ItemPedido> itens;
    private double taxaFrete;
    private int numeroMesa;


    public Pedidos(){
        itens = new ArrayList<>();
    }

    //getters e setters
    public double getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxa(double taxa) {
        this.taxaFrete = taxa;
    }
    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    public void reservarMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    //add e remover item
    public void addItem(ItemPedido item){
        itens.add(item);
    }
    public void removerItem(ItemPedido item){
        itens.remove(item);
    }

    public double calcularTotalPedido(){
        double total = 0;
        for(ItemPedido i : itens){
            total += i.getSubtotal();
        }
        if(numeroMesa == 0){
            total += taxaFrete;
        }return total;
    }


    public String mostrarPedido() {
        StringBuilder sb = new StringBuilder();

        sb.append("Pedido nº: ").append(numPedido).append("\n");
        sb.append("Reserva de mesa: ").append(numeroMesa).append("\n");
        sb.append("Itens do pedido:\n");

        for (ItemPedido item : itens) {
            sb.append(item).append("\n");
        }

        if (numeroMesa == 0) {
            sb.append("Taxa de frete: R$ ").append(taxaFrete).append("\n");
        } else {
            sb.append("Taxa de frete: Não se aplica\n");
        }
        sb.append("Total do pedido: R$ ").append(calcularTotalPedido()).append("\n");

        return sb.toString();
    }
}
