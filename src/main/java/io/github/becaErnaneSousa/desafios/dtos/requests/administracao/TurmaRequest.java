package io.github.becaErnaneSousa.desafios.dtos.requests.administracao;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.ProfessorRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurmaRequest {

    private Long id;

    @NotBlank(message = "{nome.not.blank}")
    private String nome;

    @NotNull(message = "{quantidadeAluno.not.mull}")
    private int quantidadeAluno;

    @NotBlank(message = "{dataInicio.not.blank}")
    private String dataInicio;

    @NotBlank(message = "{dataFim.not.blank}")
    private String dataFim;

    @NotNull(message = "{professor.not.mull}")
    private ProfessorRequest professor;

    @NotNull(message = "{curso.not.mull}")
    private CursoRequest curso;

}
