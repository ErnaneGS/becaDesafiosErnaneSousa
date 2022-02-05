package io.github.becaErnaneSousa.desafios.servicesinterface;

import java.util.List;

public interface ServiceInterface<T> {

    <T1> T1 criar(T t);

    <T1> T1 atualizar(T t, Long id);

    void deletar(Long id);

    List<T> listar();

    <T1> T1 obter(Long id);
}
