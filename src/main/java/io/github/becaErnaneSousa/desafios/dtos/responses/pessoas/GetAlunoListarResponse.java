package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Pessoa;

public class GetAlunoListarResponse extends GetPessoaListarResponse {

    public GetAlunoListarResponse(Pessoa pessoa) {
        super(pessoa);
    }

}
