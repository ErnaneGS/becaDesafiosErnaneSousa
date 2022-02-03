package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.entities.administracao.Escola;

public class GetEscolaListarResponse {

    private Long id;
    private String nome;

    public GetEscolaListarResponse(Escola escola) {
        this.setId(escola.getId());
        this.setNome(escola.getNome());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
