package io.github.becaErnaneSousa.desafios.dtos.requests.atividades;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.TurmaRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtividadeRequest {

    @NotBlank(message = "{nome.not.blank}")
    private String nome;

    @NotNull(message = "{descricao.not.null}")
    private String descricao;

    @NotNull(message = "{nota.not.null}")
    private double nota;

    @NotNull(message = "{turma.not.mull}")
    private TurmaRequest turma;
}
