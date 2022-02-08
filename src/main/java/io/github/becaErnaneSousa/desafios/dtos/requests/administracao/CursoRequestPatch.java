package io.github.becaErnaneSousa.desafios.dtos.requests.administracao;

import io.github.becaErnaneSousa.desafios.domains.administracao.Turma;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CursoRequestPatch {

    @NotBlank(message = "{nome.not.blank}")
    private String nome;

    @NotBlank(message = "{descricao.not.blank}")
    private String descricao;

    @Positive(message = "{cargaHoraria.positive}")
    private double cargaHoraria;

    private List<Turma> listaTurmas;

}
