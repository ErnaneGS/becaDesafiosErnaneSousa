package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.DiretorRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EscolaResponse {

    private String mensagem;
    private Long id;
    private String nome;
    private DiretorRequest diretor;

}
