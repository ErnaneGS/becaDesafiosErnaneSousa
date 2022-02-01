package io.github.becaErnaneSousa.desafios.services.servicesInterface;

import io.github.becaErnaneSousa.desafios.entities.administracao.Turma;
import java.util.List;

public interface ServiceInterface<T> {

    T criar(T t);

    T atualizar(T t, long id);

    void deletar(long id);

    List<T> listar();

    T obter(long id);
}
