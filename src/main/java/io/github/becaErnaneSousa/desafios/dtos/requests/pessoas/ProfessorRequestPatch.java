package io.github.becaErnaneSousa.desafios.dtos.requests.pessoas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorRequestPatch {

    @NotBlank(message = "Nome não pode estar em branco")
    private String nome;

    @CPF
    @NotBlank(message = "CPF não pode estar em branco")
    private String cpf;

    @NotBlank(message = "Endereço não pode estar em branco")
    private String endereco;

    @NotBlank(message = "Telefone não pode estar em branco")
    @Size(min = 11, max = 11, message = "Telefone deve possuir 11 dígitos.")
    private String telefone;

    @NotBlank(message = "Data de nascimento não pode estar en branco")
    @Size(min = 8, max = 8, message = "Data de nascimento deve possuir 8 caracteres (XX/YY/ZZZZ)")
    private String dataNascimento;

    @NotBlank(message = "Especialidade não pode estar em branco")
    String especialidade;
    
}
