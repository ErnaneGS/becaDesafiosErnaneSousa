package io.github.becaErnaneSousa.desafios.atividades;

import io.github.becaErnaneSousa.desafios.pessoas.Alunos;

import java.util.ArrayList;
import java.util.List;

public class Atividades {

    private int idAtividade;
    private String nome;
    private String descricao;
    private double nota;

    List<Atividades> listaAtividades = new ArrayList<>();

    public Atividades(String nome, String descricao, double nota) {
        this.nome = nome;
        this.descricao = descricao;
        this.nota = nota;
    }

    public Atividades() {
    }

    public int getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(int idAtividade) {
        this.idAtividade = idAtividade;
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void cadastrarAtividade(Atividades atividade) {
        listaAtividades.add(atividade);
    }

    public void consultarAtividade() {

    }

}
