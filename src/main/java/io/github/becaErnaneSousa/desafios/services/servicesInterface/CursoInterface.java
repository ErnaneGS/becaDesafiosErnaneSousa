package io.github.becaErnaneSousa.desafios.services.servicesInterface;

import io.github.becaErnaneSousa.desafios.entities.administracao.Curso;
import java.util.List;

public interface CursoInterface {

    Curso criar(Curso curso);

    Curso atualizar(Curso curso, long id);

    void deletar(long id);

    List<Curso> listar();

    Curso obter(long id);

}
