package io.github.becaErnaneSousa.desafios.services.servicesInterface;

import io.github.becaErnaneSousa.desafios.entities.atividades.Resultado;
import java.util.List;

public interface ResultadoInterface {

    Resultado criar(Resultado resultado);

    Resultado atualizar(Resultado resultado, long id);

    void deletar(long id);

    List<Resultado> listar();

    Resultado obter(long id);

}
