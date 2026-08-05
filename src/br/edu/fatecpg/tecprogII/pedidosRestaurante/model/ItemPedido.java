package br.edu.fatecpg.tecprogII.pedidosRestaurante.model;

public class ItemPedido {
    private String nomeDoPrato;
    private int qtd;
    private double precoUnitario;

    public ItemPedido(String nm, int qtd, double preco ) {
        this.nomeDoPrato = nm;
        this.qtd = qtd;
        this.precoUnitario = preco;
    }


    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public int getQtd() {
        return qtd;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getSubtotal() {
        return qtd * precoUnitario;
    }

    @Override
    public String toString() {
        return String.format(
                "Prato: %s | Quantidade: %d | Preço Unitário: R$ %.2f",
                nomeDoPrato,
                qtd,
                precoUnitario
        );
    }
}
