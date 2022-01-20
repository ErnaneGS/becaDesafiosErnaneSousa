package io.github.becaErnaneSousa.desafios.administracao;

import java.util.ArrayList;
import java.util.List;

public class Turmas {

    private int idTurma;
    private int quantidadeAluno;
    private int dataInicio;
    private int dataFim;
    private boolean status;

    List<Turmas> listaTurmas = new ArrayList<>();

    public Turmas(int quantidadeAluno, int dataInicio, int dataFim, boolean status) {
        this.quantidadeAluno = quantidadeAluno;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = true;
    }

    public Turmas() {

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

    public int getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(int dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getDataFim() {
        return dataFim;
    }

    public void setDataFim(int dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void cadastrarTurmas(Turmas turma) {
        listaTurmas.add(turma);
        turma.status = true;
    }

    public void encerrarTurma(Turmas turma) {
        turma.status = false;
    }

    public void consultarTurmas(){

    }

}