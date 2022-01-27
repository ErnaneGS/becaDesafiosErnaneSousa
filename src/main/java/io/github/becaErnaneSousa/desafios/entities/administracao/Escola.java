package io.github.becaErnaneSousa.desafios.entities.administracao;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Diretor;

import java.util.List;

public class Escola {

    private int id;
    private String nome;
    private String endereco;
    private String cnpj;
    private Diretor diretor;
    private List<Curso> listaCursos;

    public Escola(int id, String nome, String endereco, String cnpj, Diretor diretor) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.diretor = diretor;
    }

    public Escola() {

    }

    @Override
    public String toString() {
        return "Escola{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", diretor=" + diretor.getNome() +
                ", Cursos=" + listaCursos +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public void cadatsrarEscola() {
        Escola escola01 = new Escola();
    }

}