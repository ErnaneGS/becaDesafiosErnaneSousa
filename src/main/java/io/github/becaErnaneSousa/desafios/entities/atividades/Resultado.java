package io.github.becaErnaneSousa.desafios.entities.atividades;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;

public class Resultado {

    private long id;
    private double resultado;
    private Atividade atividade;
    private Aluno aluno;

    public Resultado(long id, double resultado, Atividade atividade, Aluno aluno) {
        this.id = id;
        this.resultado = resultado;
        this.atividade = atividade;
        this.aluno = aluno;
    }

    public Resultado() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void adicionarResultado() {

    }

    public void consultarResultado() {

    }

}