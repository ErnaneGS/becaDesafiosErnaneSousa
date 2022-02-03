package io.github.becaErnaneSousa.desafios.dtos.requests.pessoas;

public class AlunoRequest extends PessoaRequest {

    private String nomePai;

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

}
