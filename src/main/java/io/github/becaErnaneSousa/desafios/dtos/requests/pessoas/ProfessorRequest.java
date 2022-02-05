package io.github.becaErnaneSousa.desafios.dtos.requests.pessoas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorRequest extends PessoaRequest{

    @NotBlank(message = "{especialidade.not.blank}")
    String especialidade;
}
