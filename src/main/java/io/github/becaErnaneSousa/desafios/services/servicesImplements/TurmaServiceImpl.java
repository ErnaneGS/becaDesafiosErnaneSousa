package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.administracao.Turma;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TurmaServiceImpl implements ServiceInterface<Turma> {

    Turma turma = new Turma(001l,"Turma de Ingles", 20, "01022022", "01022023", true);

    @Override
    public Turma criar(Turma turma) {
        System.out.println(turma);

        return turma;
    }

    @Override
    public Turma atualizar(Turma turma01,  long id) {
        turma = turma01;

        return turma;
    }

    @Override
    public void deletar(long id) {
    }

    @Override
    public List<Turma> listar() {

        List<Turma> listaTurmas = new ArrayList<>();
        listaTurmas.add(new Turma(002l,"Turma de Espanhol", 20, "01022022", "01022023", true));
        listaTurmas.add(new Turma(003l,"Turma de Ingles 02", 20, "01022022", "01022023", true));
        listaTurmas.add(new Turma(004l,"Turma de Italiano", 20, "01022022", "01022023", true));

        return listaTurmas;
    }

    @Override
    public Turma obter(long id) {

        return turma;
    }

}
