package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.administracao.Curso;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.CursoInterface;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CursoServiceImpl implements CursoInterface {

    Curso cursoTeste = new Curso(001l, "Ingles", "Curso de ingles avançado", 220.0);

    @Override
    public Curso criar(Curso curso) {
        System.out.println(curso);

        return curso;
    }

    @Override
    public Curso atualizar(Curso curso01, long id) {
        cursoTeste = curso01;

        return cursoTeste;
    }

    @Override
    public void deletar(long id) {

    }

    @Override
    public List<Curso> listar() {

        List<Curso> listaCursos = new ArrayList<>();

        listaCursos.add(new Curso(002l,"Espanhol", "Espanhol avançado", 220.0));
        listaCursos.add(new Curso(003l,"Ingles", "Ingles avançado", 220.0));
        listaCursos.add(new Curso(004l,"Italiano", "Italiano avançado", 220.0));

        return (listaCursos);
    }

    @Override
    public Curso obter( long id) {

        return cursoTeste;
    }

}
