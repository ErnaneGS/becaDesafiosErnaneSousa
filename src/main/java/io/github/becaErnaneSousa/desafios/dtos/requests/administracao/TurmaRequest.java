package io.github.becaErnaneSousa.desafios.dtos.requests.administracao;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.ProfessorRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurmaRequest {

    private Long id;

    @NotBlank(message = "Nome não pode estar em branco")
    private String nome;

    @NotBlank(message = "Quantidade de aluno não pode estar em branco")
    @Min(value = 2, message = "Quantidade de aluno na turma deve ser maior que zero")
    @Max(value = 20, message = "Quantidade de aluno na turma deve ser menor igual a 20")
    private int quantidadeAluno;

    @NotBlank(message = "Data não pode estar em branco")
    @Size(min = 8, max = 8, message = "Data deve possuir 8 caracteres (XX/YY/ZZZZ)")
    private String dataInicio;

    @NotBlank(message = "Data não pode estar em branco")
    @Size(min = 8, max = 8, message = "Data deve possuir 8 caracteres (XX/YY/ZZZZ)")
    private String dataFim;

    @NotNull(message = "Profrsssor não pode ser nulo")
    private ProfessorRequest professor;

    @NotNull(message = "Curso não pode ser nulo")
    private CursoRequest curso;

}
