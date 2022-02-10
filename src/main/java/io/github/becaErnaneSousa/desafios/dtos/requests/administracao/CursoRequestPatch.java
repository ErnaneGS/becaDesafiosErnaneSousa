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

    @NotBlank(message = "Nome não pode estar em branco")
    private String nome;

    @NotBlank(message = "Descrição não pode estar em branco")
    private String descricao;

    @Positive(message = "Carga horária deve ser positiva")
    private double cargaHoraria;

    private List<Turma> listaTurmas;

}
