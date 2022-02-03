package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.entities.administracao.Turma;

public class GetTurmaListarResponse {

    private Long id;
    private String nome;
    private Boolean status;

    public GetTurmaListarResponse(Turma turma) {
        this.setId(turma.getId());
        this.setNome(turma.getNome());
        this.setStatus(turma.isStatus());
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
