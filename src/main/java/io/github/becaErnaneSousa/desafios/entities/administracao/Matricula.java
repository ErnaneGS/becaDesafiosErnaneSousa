package io.github.becaErnaneSousa.desafios.entities.administracao;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;
import javax.persistence.*;

@Entity
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data;
    private boolean status;

    @OneToOne
    private Aluno aluno;

    @OneToOne
    private Turma turma;

    public Matricula(String data, boolean status, Aluno aluno, Turma turma) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void novaMatricula(Turma turma, Aluno aluno) {

    }

    public void consultarMatricula() {

    }

    public void desativarMatricula(Matricula matricula) {

    }

}