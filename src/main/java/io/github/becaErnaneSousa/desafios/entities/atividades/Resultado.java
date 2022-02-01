package io.github.becaErnaneSousa.desafios.entities.atividades;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;

import javax.persistence.*;

@Entity
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double resultado;

    @OneToOne
    private Atividade atividade;

    @OneToOne
    private Aluno aluno;

    public Resultado(double resultado, Atividade atividade, Aluno aluno) {
        this.resultado = resultado;
        this.atividade = atividade;
        this.aluno = aluno;
    }

    public Resultado() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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