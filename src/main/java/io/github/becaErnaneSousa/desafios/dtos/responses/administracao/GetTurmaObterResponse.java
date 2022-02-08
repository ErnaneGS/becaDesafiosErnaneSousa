package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.CursoRequest;
import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.ProfessorRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTurmaObterResponse {

    private Long id;
    private String nome;
    private int quantidadeAluno;
    private String dataInicio;
    private String dataFim;
    private CursoRequest curso;
    private ProfessorRequest professor;

}