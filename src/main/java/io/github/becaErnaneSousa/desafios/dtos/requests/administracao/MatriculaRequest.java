package io.github.becaErnaneSousa.desafios.dtos.requests.administracao;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.AlunoRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaRequest {

    @NotBlank(message = "{dataInicio.not.blank}")
    private String data;

    @NotNull(message = "{aluno.not.mull}")
    private AlunoRequest aluno;

    @NotNull(message = "{turma.not.mull}")
    private TurmaRequest turma;

}
