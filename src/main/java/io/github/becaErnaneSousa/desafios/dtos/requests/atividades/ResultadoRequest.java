package io.github.becaErnaneSousa.desafios.dtos.requests.atividades;

import io.github.becaErnaneSousa.desafios.domains.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.domains.pessoas.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultadoRequest {

    @NotNull(message = "{resultado.not.blank}")
    private double resultado;

    @NotNull(message = "{atividade.not.null}")
    private Atividade atividade;

    @NotNull(message = "{aluno.not.null}")
    private Aluno aluno;
}
