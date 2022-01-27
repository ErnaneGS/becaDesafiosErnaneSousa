package io.github.becaErnaneSousa.desafios.entities.administracao;

import java.util.List;

public class Curso {

    private long id;
    private String nome;
    private String descricao;
    private double cargaHoraria;
    private List<Turma> listaTurmas;

    public Curso(long id, String nome, String descricao, double cargaHoraria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public Curso() {

    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", listaCursos=" + listaTurmas +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Turma> getListaTurma() {
        return listaTurmas;
    }

    public void setListaTurma(List<Turma> listaTurma) {
        this.listaTurmas = listaTurma;
    }

    public void consultarcurso() {

    }

}