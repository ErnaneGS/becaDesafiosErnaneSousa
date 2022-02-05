package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.entities.administracao.Turma;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTurmaListarResponse {

    private Long id;
    private String nome;
    private Boolean status;

    public GetTurmaListarResponse(Turma turma) {
        this.setId(turma.getId());
        this.setNome(turma.getNome());
        this.setStatus(turma.isStatus());
    }

}
