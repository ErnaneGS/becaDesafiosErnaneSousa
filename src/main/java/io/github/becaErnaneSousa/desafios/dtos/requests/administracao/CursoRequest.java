package io.github.becaErnaneSousa.desafios.dtos.requests.administracao;

import io.github.becaErnaneSousa.desafios.entities.administracao.Turma;
import java.util.List;

public class CursoRequest {

    private String nome;
    private String descricao;
    private double cargaHoraria;
    private List<Turma> listaTurmas;

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

    public List<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(List<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }
}