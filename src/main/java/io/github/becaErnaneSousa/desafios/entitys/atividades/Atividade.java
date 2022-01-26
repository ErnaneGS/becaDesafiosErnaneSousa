package io.github.becaErnaneSousa.desafios.entitys.atividades;

import java.util.ArrayList;
import java.util.List;

public class Atividade {

    private long id;
    private String nome;
    private String descricao;
    private double nota;

    List<Atividade> listaAtividades = new ArrayList<>();

    public Atividade(long id, String nome, String descricao, double nota) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.nota = nota;
    }

    public Atividade() {
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", nota=" + nota +
                ", listaAtividades=" + listaAtividades +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setIdAtividade(long id) {
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void cadastrarAtividade(Atividade atividade) {
        listaAtividades.add(atividade);
    }

    public void consultarAtividade() {

    }

}