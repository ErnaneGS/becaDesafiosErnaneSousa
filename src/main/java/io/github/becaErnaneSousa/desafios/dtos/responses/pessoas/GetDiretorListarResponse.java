package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.domains.pessoas.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetDiretorListarResponse {

    private String nome;
    private String dataNascimento;

    public GetDiretorListarResponse(Diretor diretor) {
        this.setNome(diretor.getNome());
        this.setDataNascimento(diretor.getDataNascimento());
    }
}
