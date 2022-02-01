package io.github.becaErnaneSousa.desafios.entities.pessoas;

import io.github.becaErnaneSousa.desafios.entities.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.entities.atividades.Resultado;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Aluno extends Pessoa {

    private String nomePai;

    @OneToMany
    private List<Matricula> listaMatriculas;

    @OneToMany
    private List<Resultado> listaResultados;

    public Aluno(String nome, String cpf, String endereco, String telefone, String dataNascimento, String nomePai) {
        super(nome, cpf, endereco, telefone, dataNascimento);
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