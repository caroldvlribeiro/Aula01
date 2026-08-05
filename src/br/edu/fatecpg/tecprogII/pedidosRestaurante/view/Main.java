package br.edu.fatecpg.tecprogII.pedidosRestaurante.view;

import br.edu.fatecpg.tecprogII.pedidosRestaurante.controller.Restaurante;
import br.edu.fatecpg.tecprogII.pedidosRestaurante.model.ItemPedido;
import br.edu.fatecpg.tecprogII.pedidosRestaurante.model.Pedidos;

public class Main {

    public static void main(String[] args) {

        Restaurante restaurante = new Restaurante();

        // Pedido 1
        Pedidos pedido1 = new Pedidos();
        pedido1.setNumPedido(1);
        pedido1.reservarMesa(5);

        pedido1.addItem(new ItemPedido("Pizza Calabresa", 2, 45.00));
        pedido1.addItem(new ItemPedido("Refrigerante", 2, 8.50));

        restaurante.adicionarPedido(pedido1);

        // Pedido 2
        Pedidos pedido2 = new Pedidos();
        pedido2.setNumPedido(2);
        pedido2.setTaxa(10.00);
        pedido2.reservarMesa(0); // Pedido para entrega

        pedido2.addItem(new ItemPedido("Hambúrguer", 1, 30.00));
        pedido2.addItem(new ItemPedido("Batata Frita", 1, 18.00));
        pedido2.addItem(new ItemPedido("Suco", 2, 9.00));

        restaurante.adicionarPedido(pedido2);

        // Mostrar todos os pedidos
        System.out.println("===== TODOS OS PEDIDOS =====");
        System.out.println(restaurante.mostrarPedidos());

        // Buscar pedido
        System.out.println("===== BUSCA DO PEDIDO Nº 2 =====");
        Pedidos busca = restaurante.buscarPedido(2);
        if (busca != null) {
            System.out.println(busca.mostrarPedido());
        } else {
            System.out.println("Pedido não encontrado.");
        }
        // Remover pedido
        restaurante.removerPedido(pedido1);
        System.out.println("===== APÓS REMOVER O PEDIDO 1 =====");
        System.out.println(restaurante.mostrarPedidos());
    }
}