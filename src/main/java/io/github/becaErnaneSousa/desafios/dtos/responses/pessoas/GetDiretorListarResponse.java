package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Pessoa;

public class GetDiretorListarResponse extends GetPessoaListarResponse{

    public GetDiretorListarResponse(Pessoa pessoa) {
        super(pessoa);
    }
}
