package io.github.becaErnaneSousa.desafios.services.servicesInterface;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Diretor;
import java.util.List;

public interface DiretorInterface {

    Diretor criar(Diretor diretor);

    Diretor atualizar(Diretor diretor, long id);

    void deletar(long id);

    List<Diretor> listar();

    Diretor obter(long id);

}
