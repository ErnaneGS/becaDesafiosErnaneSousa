package io.github.becaErnaneSousa.desafios.pessoas;

import java.util.ArrayList;
import java.util.List;

public class Alunos extends Pessoa {

    String nomePai;

    List<Alunos> listaAlunos = new ArrayList<>();

    public Alunos(String nome, String cpf, String endereco, String telefone, int dataNascimento, String nomePai) {
        super(nome, cpf, endereco, telefone, dataNascimento);
        this.nomePai = nomePai;
    }

    public Alunos() {
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public void cadastrarAluno(Alunos aluno) {
        listaAlunos.add(aluno);
    }

    public void consultarAluno() {

    }

}