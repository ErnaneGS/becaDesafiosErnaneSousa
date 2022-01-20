package io.github.becaErnaneSousa.desafios.administracao;

import io.github.becaErnaneSousa.desafios.pessoas.Alunos;

import java.util.ArrayList;
import java.util.List;

public class Matriculas {

    private int idMatricula;
    private int data;
    private boolean status;

    public Matriculas(int data, boolean status) {
        this.data = data;
        this.status = status;
    }

    public Matriculas() {
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void novaMatricula(Turmas turma, Alunos aluno) {

    }

    public void consultarMatricula() {

    }

    public void desativarMatricula(Matriculas matricula) {
        matricula.status = false;
    }
}