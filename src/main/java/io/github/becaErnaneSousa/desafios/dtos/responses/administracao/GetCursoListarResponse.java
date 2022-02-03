package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.entities.administracao.Curso;

public class GetCursoListarResponse {

    private Long id;
    private String nome;

    public GetCursoListarResponse(Curso curso) {
        this.setId(curso.getId());
        this.setNome(curso.getNome());
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
