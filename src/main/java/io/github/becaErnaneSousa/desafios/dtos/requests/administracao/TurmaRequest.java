package io.github.becaErnaneSousa.desafios.dtos.requests.administracao;

import io.github.becaErnaneSousa.desafios.entities.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.entities.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Professor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurmaRequest {

    @NotBlank(message = "{nome.not.blank}")
    private String nome;

    @Positive(message = "{quantidadeAluno.positive}")
    private int quantidadeAluno;

    @Past(message = "{dataInicio.past}")
    private Date dataInicio;

    @Past(message = "{dataInicio.future}")
    private Date dataFim;

    @NotBlank(message = "{status.not.blank}")
    private boolean status;

    @NotNull(message = "{professor.not.null}")
    private Professor professor;

    private List<Matricula> listaMatriculas;

    private List<Atividade> listaAtividades;

}