package io.github.becaErnaneSousa.desafios.services.servicesInterface;

import io.github.becaErnaneSousa.desafios.entities.atividades.Atividade;
import java.util.List;

public interface AtividadeInterface {

    Atividade criar(Atividade atividade);

    Atividade atualizar(Atividade atividade, long id);

    void deletar(long id);

    List<Atividade> listar();

    Atividade obter(long id);

}
