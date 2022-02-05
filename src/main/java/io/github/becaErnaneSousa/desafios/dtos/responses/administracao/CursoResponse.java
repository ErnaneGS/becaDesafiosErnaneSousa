package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CursoResponse {

    private Long cadastro;
    private String mensagem;

}