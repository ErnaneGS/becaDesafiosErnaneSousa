package io.github.becaErnaneSousa.desafios.dtos.requests.atividades;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.TurmaRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtividadeRequest {

    @NotBlank(message = "Nome não pode estar em branco")
    private String nome;

    @NotBlank(message = "Descrição não pode estar em branco")
    private String descricao;

    @NotBlank(message = "Nota não pode estar em branco")
    @Min(value = 0, message = "A nota de ve ser maior que zero")
    private double nota;

    @NotNull(message = "Turma não pode ser nulo")
    private TurmaRequest turma;

}
