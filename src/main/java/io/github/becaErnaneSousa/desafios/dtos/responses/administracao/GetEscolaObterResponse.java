package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.domains.administracao.Curso;
import io.github.becaErnaneSousa.desafios.domains.pessoas.Diretor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetEscolaObterResponse {

    private Long id;
    private String nome;
    private String endereco;
    private String cnpj;
    private Diretor diretor;
    private List<Curso> listaCursos;

}
