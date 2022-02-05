package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetPessoaListarResponse {

    private String nome;
    private String dataNascimento;

    public GetPessoaListarResponse(Pessoa pessoa) {
        this.setNome(pessoa.getNome());
        this.setDataNascimento(pessoa.getDataNascimento());
    }

}
