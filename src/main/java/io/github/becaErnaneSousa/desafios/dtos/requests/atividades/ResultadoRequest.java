package io.github.becaErnaneSousa.desafios.dtos.requests.atividades;

import io.github.becaErnaneSousa.desafios.domains.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.domains.pessoas.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultadoRequest {

    @NotBlank(message = "Resultado não pode estar em branco")
    private double resultado;

    @NotNull(message = "Atividade não pode ser nula")
    private Atividade atividade;

    @NotNull(message = "Aluno não pode ser nulo")
    private Aluno aluno;
}
