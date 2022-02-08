package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.domains.administracao.Turma;
import io.github.becaErnaneSousa.desafios.domains.pessoas.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetMatriculaObterResponse {

    private Long id;
    private String data;
//    private boolean status;
    private Aluno aluno;
    private Turma turma;

}
