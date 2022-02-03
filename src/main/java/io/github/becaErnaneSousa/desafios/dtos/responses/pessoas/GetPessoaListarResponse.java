package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Pessoa;

public class GetPessoaListarResponse {

    private String nome;
    private String dataNascimento;

    public GetPessoaListarResponse(Pessoa pessoa) {
        this.setNome(pessoa.getNome());
        this.setDataNascimento(pessoa.getDataNascimento());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
