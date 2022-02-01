package io.github.becaErnaneSousa.desafios.entities.pessoas;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Professor extends Pessoa {

    String especialidade;

    @OneToMany
    List<Professor> listaProfessor = new ArrayList<>();

    public Professor(String nome, String cpf, String endereco, String telefone, String dataNascimento, String especialidade) {
        super(nome, cpf, endereco, telefone, dataNascimento);
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