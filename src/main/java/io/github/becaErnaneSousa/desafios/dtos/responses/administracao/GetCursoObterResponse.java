package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.domains.administracao.Turma;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCursoObterResponse {

    private Long id;
    private String nome;
    private String descricao;
    private double cargaHoraria;
    private List<Turma> listaTurmas;

}