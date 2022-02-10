package io.github.becaErnaneSousa.desafios.dtos.requests.administracao;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.AlunoRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaRequest {

    @NotBlank(message = "Data não pode estar em branco")
    @Size(min = 8, max = 8, message = "Data deve possuir 8 caracteres (XX/YY/ZZZZ)")
    private String data;

    @NotNull(message = "Aluno não pode ser nulo")
    private AlunoRequest aluno;

    @NotNull(message = "Turma não pode ser nula")
    private TurmaRequest turma;

}
