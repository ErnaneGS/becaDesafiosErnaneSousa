package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiretorResponse {

    private String mensagem;
    private Long id;
    private String nome;

}
