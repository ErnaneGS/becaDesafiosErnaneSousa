package io.github.becaErnaneSousa.desafios.entities.pessoas;

import io.github.becaErnaneSousa.desafios.entities.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.entities.atividades.Resultado;

import java.util.List;

public class Aluno extends Pessoa {

    private String nomePai;
    private List<Matricula> listaMatriculas;
    private List<Resultado> listaResultados;

    public Aluno(long id, String nome, String cpf, String endereco, String telefone, String dataNascimento, String nomePai) {
        super(id, nome, cpf, endereco, telefone, dataNascimento);
        this.nomePai = nomePai;
    }

    public Aluno() {
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }

    public List<Resultado> getListaResultados() {
        return listaResultados;
    }

    public void setListaResultados(List<Resultado> listaResultados) {
        this.listaResultados = listaResultados;
    }

    public void consultarAluno() {

    }

}