package io.github.becaErnaneSousa.desafios.services.servicesInterface;

import io.github.becaErnaneSousa.desafios.entities.administracao.Matricula;
import java.util.List;

public interface MatriculaInterface {

    Matricula criar(Matricula matricula);

    Matricula atualizar(Matricula matricula, long id);

    void deletar(long id);

    List<Matricula> listar();

    Matricula obter(long id);

}
