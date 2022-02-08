package io.github.becaErnaneSousa.desafios.dtos.responses.atividades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAtividadeListarResponse {

    private Long id;
    private String nome;

}