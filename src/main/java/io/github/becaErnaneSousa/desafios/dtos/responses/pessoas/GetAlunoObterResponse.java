package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

public class GetAlunoObterResponse extends GetPessoaObterResponse {

    private String nomePai;

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

}
