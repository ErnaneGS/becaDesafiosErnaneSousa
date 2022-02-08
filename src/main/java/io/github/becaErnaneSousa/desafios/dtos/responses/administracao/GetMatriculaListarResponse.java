package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.domains.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.domains.administracao.Turma;
import io.github.becaErnaneSousa.desafios.domains.pessoas.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetMatriculaListarResponse {

    private Long id;
    private Aluno aluno;
    private Turma turma;

    public GetMatriculaListarResponse(Matricula matricula) {
        this.setId(matricula.getId());
        this.setAluno(matricula.getAluno());
        this.setTurma(matricula.getTurma());
    }

}
