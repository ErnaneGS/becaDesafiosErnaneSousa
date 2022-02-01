package io.github.becaErnaneSousa.desafios.services.servicesInterface;

import java.util.List;

public interface ServiceInterface<T> {

    T criar(T t);

    T atualizar(T t, Long id);

    void deletar(Long id);

    List<T> listar();

    T obter(Long id);
}
