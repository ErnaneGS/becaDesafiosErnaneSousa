package io.github.becaErnaneSousa.desafios.entitys.administracao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private long id;
    private String nome;
    private String descricao;
    private double cargaHoraria;

    List<Curso> listaCursos = new ArrayList<>();

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
                ", listaCursos=" + listaCursos +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setIdCurso(long idCurso) {
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

    public void cadastrarCurso(Curso curso) {
        listaCursos.add(curso);
    }

    public void consultarcurso() {

    }

}