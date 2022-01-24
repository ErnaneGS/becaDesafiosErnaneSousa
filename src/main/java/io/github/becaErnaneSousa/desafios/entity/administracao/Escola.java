package io.github.becaErnaneSousa.desafios.entity.administracao;

public class Escola {

    private int idEscola = 01;
    private String nome;
    private String endereco;
    private String cnpj;

    public Escola(int idEscola, String nome, String endereco, String cnpj) {
        this.idEscola = idEscola;
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public Escola() {

    }

    public int getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(int idEscola) {
        this.idEscola = idEscola;
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

    @Override
    public String toString() {
        return "Escola{" +
                "idEscola=" + idEscola +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}