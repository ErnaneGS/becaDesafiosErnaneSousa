package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetEscolaListarResponse {

    private Long id;
    private String nome;

}
