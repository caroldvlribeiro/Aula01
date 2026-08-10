package br.edu.fatecpg.tecprogII.TreinamentoTec.view;
import br.edu.fatecpg.tecprogII.TreinamentoTec.controller.*;
import br.edu.fatecpg.tecprogII.TreinamentoTec.model.*;

public class Main {
    public static void main(String[] args) {
        Treinamento online = new TreinamentoOnline(1, "João Vitor", "Java", "Zoom");
        Treinamento presencial = new TreinamentoPresencial(2, "Giovana", "SQL", "https://link.com/acesso");

        online.getUltimoTreinamento(new Aluno("Maria", 10));
        online.getUltimoTreinamento(new Aluno("Francisco", 9.0));

        presencial.getUltimoTreinamento(new Aluno("Pedro", 7.0));

        System.out.println(online);
        System.out.println(presencial);

        System.out.println("Média online: " + online.calcularMediaAlunos());
        System.out.println("Média presencial: " + presencial.calcularMediaAlunos());

        System.out.println("Online tem vaga? " + online.verificarDisponibilidade());
    }
}