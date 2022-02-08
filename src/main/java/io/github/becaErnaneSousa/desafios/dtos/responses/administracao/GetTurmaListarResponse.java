package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.domains.administracao.Turma;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTurmaListarResponse {

    private Long id;
    private String nome;

    public GetTurmaListarResponse(Turma turma) {
        this.setId(turma.getId());
        this.setNome(turma.getNome());
    }

}