package br.edu.fatecpg.tecprogII.pedidosRestaurante.model;
import java.util.*;
import br.edu.fatecpg.tecprogII.pedidosRestaurante.model.ItemPedido;

import javax.print.DocFlavor;

public class Pedidos {
    private int numPedido;
    private List<ItemPedido> itens;

    public Pedidos(){
        itens = new ArrayList<>();
    }
    public String mostrarPedidos(){
        StringBuilder sb = new StringBuilder();
        for(ItemPedido i : itens){
            sb.append(i);
        }
        return sb.toString();
    }
}
