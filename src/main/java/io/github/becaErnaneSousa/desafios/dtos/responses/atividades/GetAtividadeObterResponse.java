package io.github.becaErnaneSousa.desafios.dtos.responses.atividades;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.TurmaRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAtividadeObterResponse {

    private Long id;
    private String nome;
    private String descricao;
    private double nota;
    private TurmaRequest turma;

}
