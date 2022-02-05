package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.entities.administracao.Escola;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetEscolaListarResponse {

    private Long id;
    private String nome;

    public GetEscolaListarResponse(Escola escola) {
        this.setId(escola.getId());
        this.setNome(escola.getNome());
    }

}
