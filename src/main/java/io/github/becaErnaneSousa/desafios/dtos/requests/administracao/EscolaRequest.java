package io.github.becaErnaneSousa.desafios.dtos.requests.administracao;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.DiretorRequest;
import io.github.becaErnaneSousa.desafios.domains.administracao.Curso;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EscolaRequest {

    @NotBlank(message = "{nome.not.blank}")
    private String nome;

    @NotBlank(message = "{endereco.not.blank}")
    private String endereco;

    @CNPJ
    private String cnpj;

    @NotNull(message = "{diretor.not.null}")
    private DiretorRequest diretor;

    private List<Curso> listaCursos;

}