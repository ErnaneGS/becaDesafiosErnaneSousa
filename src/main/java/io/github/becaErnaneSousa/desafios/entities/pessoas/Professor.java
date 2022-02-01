package io.github.becaErnaneSousa.desafios.entities.pessoas;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

    String especialidade;

    List<Professor> listaProfessor = new ArrayList<>();

    public Professor(long id, String nome, String cpf, String endereco, String telefone, String dataNascimento, String especialidade) {
        super(id, nome, cpf, endereco, telefone, dataNascimento);
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void cadatsrarProfessor(Professor professor) {
        listaProfessor.add(professor);
    }

    public void consultarProfessore() {

    }

}