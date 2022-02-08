package io.github.becaErnaneSousa.desafios.dtos.responses.atividades;

import io.github.becaErnaneSousa.desafios.domains.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.domains.pessoas.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetResultadoObterResponse {

    private Long id;
    private double resultado;
    private Atividade atividade;
    private Aluno aluno;

}
