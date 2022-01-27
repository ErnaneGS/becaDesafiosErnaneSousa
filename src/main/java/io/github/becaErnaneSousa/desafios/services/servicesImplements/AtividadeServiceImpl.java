package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.AtividadeInterface;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AtividadeServiceImpl implements AtividadeInterface {

    Atividade atividade = new Atividade(001l,"Atividade de Ingles 01", "Teste do primeiro bimestre", 10.0);

    @Override
    public Atividade criar(Atividade atividade) {
        System.out.println(atividade);

        return atividade;
    }

    @Override
    public Atividade atualizar(Atividade atividade01, long id) {
        atividade = atividade01;

        return atividade;
    }

    @Override
    public void deletar(long id) {
    }

    @Override
    public List<Atividade> listar() {
        List<Atividade> ListaAtividades = new ArrayList<>();

        ListaAtividades.add(new Atividade(003l,"Atividade de Espanhol 01", "Teste do primeiro bimestre", 10.0));
        ListaAtividades.add(new Atividade(004l,"Atividade de Ingles 02", "Teste do segundo bimestre", 10.0));
        ListaAtividades.add(new Atividade(005l,"Atividade de Italiano 01", "Teste do primeiro bimestre", 10.0));

        return ListaAtividades;
    }

    @Override
    public Atividade obter(long id) {

        return atividade;
    }

}
