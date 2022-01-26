package io.github.becaErnaneSousa.desafios.entitys.administracao;

import io.github.becaErnaneSousa.desafios.entitys.pessoas.Aluno;

import java.util.Date;

public class Matricula {

    private long id;
    private String data;
    private boolean status;

    public Matricula(long id, String data, boolean status) {
        this.id = id;
        this.data = data;
        this.status = status;;
    }

    public Matricula() {
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "idMatricula=" + id +
                ", data='" + data + '\'' +
                ", status=" + status +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

}