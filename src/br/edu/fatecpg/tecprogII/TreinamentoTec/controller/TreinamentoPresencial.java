package br.edu.fatecpg.tecprogII.TreinamentoTec.controller;

public class TreinamentoPresencial extends Treinamento {
    private String linkAcesso;

    public TreinamentoPresencial(int id, String nomeInstrutor, String linguagemEnsinada, String linkAcesso) {
        super(id, nomeInstrutor, linguagemEnsinada);
        this.linkAcesso = linkAcesso;
    }

    public String getLinkAcesso() {
        return linkAcesso;
    }

    public void setLinkAcesso(String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }

    @Override
    public String toString() {
        return super.toString().replace("Treinamento{", "TreinamentoPresencial{") +
                " [linkAcesso=" + linkAcesso + "]";
    }
}
