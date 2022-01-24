package io.github.becaErnaneSousa.desafios.entity.administracao;

import io.github.becaErnaneSousa.desafios.entity.pessoas.Aluno;

public class Matricula {

    private int idMatricula;
    private String data;
    private boolean status;

    public Matricula(String data, boolean status) {
        this.data = data;
        this.status = status;;
    }

    public Matricula() {
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void novaMatricula(Turma turma, Aluno aluno) {

    }

    public void consultarMatricula() {

    }

    public void desativarMatricula(Matricula matricula) {

    }

    @Override
    public String toString() {
        return "Matricula{" +
                "idMatricula=" + idMatricula +
                ", data='" + data + '\'' +
                ", status=" + status +
                '}';
    }
}