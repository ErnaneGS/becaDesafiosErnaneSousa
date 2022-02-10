package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetDiretorObterResponse {

    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String dataNascimento;

}
