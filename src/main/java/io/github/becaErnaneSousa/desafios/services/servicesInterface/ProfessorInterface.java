package io.github.becaErnaneSousa.desafios.services.servicesInterface;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Professor;
import java.util.List;

public interface ProfessorInterface {

    Professor criar(Professor professor);

    Professor atualizar(Professor professor, long id);

    void deletar(long id);

    List<Professor> listar();

    Professor obter(long id);
}
