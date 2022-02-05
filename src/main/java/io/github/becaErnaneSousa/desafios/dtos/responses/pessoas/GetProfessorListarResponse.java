package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class GetProfessorListarResponse extends GetPessoaListarResponse {

    public GetProfessorListarResponse(Pessoa pessoa) {
        super(pessoa);
    }
}
