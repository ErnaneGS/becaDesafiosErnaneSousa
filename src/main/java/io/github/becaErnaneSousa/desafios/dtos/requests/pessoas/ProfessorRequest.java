package io.github.becaErnaneSousa.desafios.dtos.requests.pessoas;

public class ProfessorRequest extends PessoaRequest{

    String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
