package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetProfessorObterResponse extends GetPessoaObterResponse{

    private String especialidade;

}
