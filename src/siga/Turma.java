package siga;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(String nome) {
        this.nome = nome;
    }

    public void matricularAluno(Aluno a) {
        alunos.add(a);
    }

    public double calcularMediaTurma() {
        double soma = 0;
        for (Aluno a : alunos) {
            soma += a.getMedia();
        }
        return soma / alunos.size();
    }
}