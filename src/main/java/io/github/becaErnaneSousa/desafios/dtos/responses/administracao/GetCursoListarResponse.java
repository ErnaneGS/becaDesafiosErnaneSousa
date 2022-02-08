package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.domains.administracao.Curso;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCursoListarResponse {

    private Long id;
    private String nome;

    public GetCursoListarResponse(Curso curso) {
        this.setId(curso.getId());
        this.setNome(curso.getNome());
    }

}
