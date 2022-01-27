package io.github.becaErnaneSousa.desafios.entities.administracao;

import io.github.becaErnaneSousa.desafios.entities.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Professor;

import java.util.List;

public class Turma {

    private long id;
    private String nome;
    private int quantidadeAluno;
    private String dataInicio;
    private String dataFim;
    private boolean status;
    private Professor professor;
    private List<Matricula> listaMatriculas;
    private List<Atividade> listaAtividades;

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
                ", dataInicio='" + dataInicio + '\'' +
                ", dataFim='" + dataFim + '\'' +
                ", status=" + status +
                ", professor=" + professor +
                ", listaMatriculas=" + listaMatriculas +
                ", listaAtividades=" + listaAtividades +
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }

    public List<Atividade> getListaAtividades() {
        return listaAtividades;
    }

    public void setListaAtividades(List<Atividade> listaAtividades) {
        this.listaAtividades = listaAtividades;
    }

    public void cadastrarTurmas(Turma turma) {
        turma.status = true;
    }

    public void encerrarTurma(Turma turma) {
        turma.status = false;
    }

    public void consultarTurmas(){

    }

}