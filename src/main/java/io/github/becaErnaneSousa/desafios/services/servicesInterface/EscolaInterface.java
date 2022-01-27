package io.github.becaErnaneSousa.desafios.services.servicesInterface;

import io.github.becaErnaneSousa.desafios.entities.administracao.Escola;
import java.util.List;

public interface EscolaInterface {

    Escola criar(Escola escola);

    Escola atualizar(Escola escola, long id);

    void deletar(long id);

    List<Escola> listar();

    Escola obter(long id);

}
