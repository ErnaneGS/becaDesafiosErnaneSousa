package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

import lombok.Data;

@Data
public class GetDiretorObterResponse {

    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String dataNascimento;

}
