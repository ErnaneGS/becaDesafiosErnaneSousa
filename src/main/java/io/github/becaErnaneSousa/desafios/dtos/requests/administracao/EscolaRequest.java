package io.github.becaErnaneSousa.desafios.dtos.requests.administracao;

import io.github.becaErnaneSousa.desafios.entities.administracao.Curso;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Diretor;
import java.util.List;

public class EscolaRequest {

    private String nome;
    private String endereco;
    private String cnpj;
    private Diretor diretor;
    private List<Curso> listaCursos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

}
