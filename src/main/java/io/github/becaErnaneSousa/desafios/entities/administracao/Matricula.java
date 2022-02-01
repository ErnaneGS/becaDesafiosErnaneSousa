package io.github.becaErnaneSousa.desafios.entities.administracao;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;

public class Matricula {

    private long id;
    private String data;
    private boolean status;
    private Aluno aluno;
    private Turma turma;

    public Matricula(long id, String data, boolean status, Aluno aluno, Turma turma) {
        this.id = id;
        this.data = data;
        this.status = status;
        this.aluno = aluno;
        this.turma = turma;
    }

    public Matricula() {
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", status=" + status +
                ", aluno=" + aluno.getNome() +
                ", turma=" + turma.getId() +
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