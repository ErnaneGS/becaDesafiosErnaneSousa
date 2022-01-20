package io.github.becaErnaneSousa.desafios.administracao;

public class Escola {

    private int idEscola = 0001;
    private String nome;
    private String endereco;
    private String cnpj;

    public Escola(String nome, String endereco, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public Escola() {

    }

    public Integer getIdEscola() {
        return idEscola;
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