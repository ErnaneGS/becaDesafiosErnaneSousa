package io.github.becaErnaneSousa.desafios.dtos.responses.pessoas;

public class PessoaResponse {

    private Long cadastro;
    private String mensagem;

    public Long getCadastro() {
        return cadastro;
    }

    public void setCadastro(Long cadastro) {
        this.cadastro = cadastro;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
