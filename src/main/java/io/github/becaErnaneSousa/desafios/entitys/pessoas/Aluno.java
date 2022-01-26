package io.github.becaErnaneSousa.desafios.entitys.pessoas;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    String nomePai;

    List<Aluno> listaAlunos = new ArrayList<>();

    public Aluno(long id, String nome, String cpf, String endereco, String telefone, String dataNascimento, String nomePai) {
        super(id, nome, cpf, endereco, telefone, dataNascimento);
        this.nomePai = nomePai;
    }

    public Aluno() {
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public void cadastrarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void consultarAluno() {

    }

}