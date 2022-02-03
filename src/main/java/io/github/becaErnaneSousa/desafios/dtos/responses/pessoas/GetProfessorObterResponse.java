package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

public class GetProfessorObterResponse extends GetPessoaObterResponse{

    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
