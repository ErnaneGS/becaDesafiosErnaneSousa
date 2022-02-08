package io.github.becaErnaneSousa.desafios.dtos.requests.pessoas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiretorRequest  {

//    private Long id;

    @NotNull(message = "{nome.not.blank}")
    private String nome;

    @CPF
    private String cpf;

    @NotBlank(message = "{endereco.not.blank}")
    private String endereco;

    @NotNull
    @Size(min = 11, max = 11)
    private String telefone;

    @NotNull
    @Size(min = 8, max = 8)
    private String dataNascimento;

}
