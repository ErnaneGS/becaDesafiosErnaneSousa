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

    @NotBlank(message = "Nome não pode estar em branco")
    private String nome;

    @NotBlank(message = "Endereço não pode estar em branco")
    private String endereco;

    @CNPJ
    @NotBlank(message = "CNPJ não pode estar em branco")
    private String cnpj;

    @NotNull(message = "Diretor não pode ser nulo")
    private DiretorRequest diretor;

    private List<Curso> listaCursos;

}
