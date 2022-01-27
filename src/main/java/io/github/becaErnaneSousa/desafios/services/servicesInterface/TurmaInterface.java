package io.github.becaErnaneSousa.desafios.services.servicesInterface;

import io.github.becaErnaneSousa.desafios.entities.administracao.Turma;
import java.util.List;

public interface TurmaInterface {

    Turma criar(Turma turma);

    Turma atualizar(Turma turma, long id);

    void deletar(long id);

    List<Turma> listar();

    Turma obter(long id);
}
