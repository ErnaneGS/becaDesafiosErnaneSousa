package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.CursoRequest;
import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.ProfessorRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurmaResponse {

    private String mensagem;
    private Long id;
    private String nome;
    private CursoRequest curso;
    private ProfessorRequest professor;

}
