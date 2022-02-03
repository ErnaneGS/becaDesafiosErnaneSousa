package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Pessoa;

public class GetProfessorListarResponse extends GetPessoaListarResponse {

    public GetProfessorListarResponse(Pessoa pessoa) {
        super(pessoa);
    }
}
