package br.edu.fatecpg.tecprogII.pedidosRestaurante.controller;
import br.edu.fatecpg.tecprogII.pedidosRestaurante.model.Pedidos;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Pedidos> pedidos;


    public Restaurante(){
        pedidos = new ArrayList<>();
    }
    public void adicionarPedido(Pedidos pedido){
        pedidos.add(pedido);
    }
    public void removerPedido(Pedidos pedido){
        pedidos.remove(pedido);
    }

    public Pedidos buscarPedido(int numeroPedido) {
        for (Pedidos pedido : pedidos) {
            if (pedido.getNumPedido() == numeroPedido) {
                return pedido;
            }
        }

        return null;
    }

    public String mostrarPedidos() {
        StringBuilder sb = new StringBuilder();

        for (Pedidos pedido : pedidos) {
            sb.append("=================================\n");
            sb.append(pedido.mostrarPedido());
            sb.append("=================================\n\n");
        }

        return sb.toString();
    }
}
