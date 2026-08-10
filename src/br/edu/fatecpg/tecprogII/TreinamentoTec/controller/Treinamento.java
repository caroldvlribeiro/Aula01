package br.edu.fatecpg.tecprogII.TreinamentoTec.controller;
import br.edu.fatecpg.tecprogII.TreinamentoTec.model.Aluno;

import java.util.List;
import java.util.ArrayList;

public class Treinamento {

    private int id;
    private String nomeInstrutor;
    private String linguagemEnsinada;
    private List<Aluno> alunos;
    private int cargaHoraria;
    private int qtd_vagas = 20;

    public Treinamento(int id, String nomeInstrutor, String linguagemEnsinada) {
        this.id = id;
        this.nomeInstrutor = nomeInstrutor;
        this.linguagemEnsinada = linguagemEnsinada;
        this.alunos = new ArrayList<>();
        this.cargaHoraria = 80;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public void setNomeInstrutor(String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    public String getLinguagemEnsinada() {
        return linguagemEnsinada;
    }

    public void setLinguagemEnsinada(String linguagemEnsinada) {
        this.linguagemEnsinada = linguagemEnsinada;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Verifica se ainda há vaga disponível no treinamento
    public boolean verificarDisponibilidade() {
        return alunos.size() < qtd_vagas;
    }

    // Adiciona um aluno ao treinamento, se houver vaga
    public void getUltimoTreinamento(Aluno aluno) {
        if (verificarDisponibilidade()) {
            alunos.add(aluno);
        } else {
            System.out.println("Não há vagas disponíveis neste treinamento.");
        }
    }

    public double calcularMediaAlunos() {
        if (alunos.isEmpty()) {
            return 0.0;
        }

        double mediaGeral = 0.0;
        int c = 0;

        for (Aluno a : alunos) {
            mediaGeral += a.getNotaFinal();
            c++;
        }
        mediaGeral = mediaGeral / c;
        return mediaGeral;
    }

    @Override
    public String toString() {
        return "Treinamento{" +
                "id=" + id +
                ", nomeInstrutor='" + nomeInstrutor + '\'' +
                ", linguagemEnsinada='" + linguagemEnsinada + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}