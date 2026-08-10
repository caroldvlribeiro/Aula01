package br.edu.fatecpg.tecprogII.TreinamentoTec.controller;

public class TreinamentoOnline extends Treinamento {
    private String local;

    public TreinamentoOnline(int id, String nomeInstrutor, String linguagemEnsinada, String local) {
        super(id, nomeInstrutor, linguagemEnsinada);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return super.toString().replace("Treinamento{", "TreinamentoOnline{") +
                " [local=" + local + "]";
    }
}