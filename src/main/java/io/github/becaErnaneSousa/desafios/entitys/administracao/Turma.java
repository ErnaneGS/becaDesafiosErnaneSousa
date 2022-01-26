package io.github.becaErnaneSousa.desafios.entitys.administracao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Turma {

    private long id;
    private String nome;
    private int quantidadeAluno;
    private String dataInicio;
    private String dataFim;
    private boolean status;

    List<Turma> listaTurmas = new ArrayList<>();

    public Turma(long id, String nome, int quantidadeAluno, String dataInicio, String dataFim, boolean status) {
        this.id = id;
        this.nome = nome;
        this.quantidadeAluno = quantidadeAluno;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
    }

    public Turma() {

    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", quantidadeAluno=" + quantidadeAluno +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", status=" + status +
                ", listaTurmas=" + listaTurmas +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long idTurma) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeAluno() {
        return quantidadeAluno;
    }

    public void setQuantidadeAluno(int quantidadeAluno) {
        this.quantidadeAluno = quantidadeAluno;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void cadastrarTurmas(Turma turma) {
        listaTurmas.add(turma);
        turma.status = true;
    }

    public void encerrarTurma(Turma turma) {
        turma.status = false;
    }

    public void consultarTurmas(){

    }

}