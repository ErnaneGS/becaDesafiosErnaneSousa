package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetProfessorObterResponse {

    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String dataNascimento;
    private String especialidade;

}
