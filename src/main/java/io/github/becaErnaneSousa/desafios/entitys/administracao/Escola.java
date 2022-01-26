package io.github.becaErnaneSousa.desafios.entitys.administracao;

import io.github.becaErnaneSousa.desafios.entitys.pessoas.Diretor;

public class Escola {

    private int id;
    private String nome;
    private String endereco;
    private String cnpj;

    public Escola(int id, String nome, String endereco, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public Escola() {

    }

    @Override
    public String toString() {
        return "Escola{" +
                "idEscola=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }

    public int getIdEscola() {
        return id;
    }

    public void setIdEscola(int idEscola) {
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

    public void cadatsrarEscola() {
        Escola escola01 = new Escola();
    }

}