package io.github.becaErnaneSousa.desafios.dtos.responses.atividades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultadoResponse {

    private String mensagem;
    private Long id;

}
