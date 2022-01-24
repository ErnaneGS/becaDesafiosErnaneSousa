package io.github.becaErnaneSousa.desafios.entity.administracao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private int idCurso;
    private String nome;
    private String descricao;
    private double cargaHoraria;

    List<Curso> listaCursos = new ArrayList<>();

    public Curso(String nome, String descricao, double cargaHoraria) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public Curso() {

    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
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