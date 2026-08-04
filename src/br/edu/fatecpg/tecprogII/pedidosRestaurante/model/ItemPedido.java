package br.edu.fatecpg.tecprogII.pedidosRestaurante.model;

public class ItemPedido {
    private String nmDoPrato;
    private int qtd;
    private double precoUnitario;

    public ItemPedido(String nm, int qtd, double preco ) {
        this.nmDoPrato = nm;
        this.qtd = qtd;
        this.precoUnitario = preco;
    }

    public void getNmPrato(String nm){
        this.nmDoPrato = nm;
    }


    @Override
    public String toString() {
        return "ItemPedido{" +
                "nmDoPrato='" + nmDoPrato + '\'' +
                ", Quantidade=" + qtd +
                ", Preço Unitario=" + precoUnitario +
                '}';
    }
}
