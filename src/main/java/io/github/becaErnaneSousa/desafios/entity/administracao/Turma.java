package io.github.becaErnaneSousa.desafios.entity.administracao;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private int idTurma;
    private String nome;
    private int quantidadeAluno;
    private String dataInicio;
    private String dataFim;
    private boolean status;

    List<Turma> listaTurmas = new ArrayList<>();

    public Turma(String nome, int quantidadeAluno, String dataInicio, String dataFim, boolean status) {
        this.nome = nome;
        this.quantidadeAluno = quantidadeAluno;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
    }

    public Turma() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
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