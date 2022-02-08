package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Professor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProfessorListarResponse {

    private String nome;
    private String dataNascimento;

    public GetProfessorListarResponse(Professor professor) {
        this.setNome(professor.getNome());
        this.setDataNascimento(professor.getDataNascimento());
    }
}
