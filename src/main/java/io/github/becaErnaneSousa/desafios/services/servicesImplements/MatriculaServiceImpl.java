package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.entities.administracao.Turma;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MatriculaServiceImpl implements ServiceInterface<Matricula> {

    Aluno aluno = new Aluno(001l, "Ernane Sousa", "00000000000", "31999999999", "Sousa", "08011992" ,"Jose");
    Turma turma = new Turma(001l,"Turma de Ingles", 20, "01022022", "01022023", true);
    Matricula matricula = new Matricula(001l, "01012022", true, aluno, turma);

    @Override
    public Matricula criar(Matricula matricula) {
        System.out.println(matricula);

        return matricula;
    }

    @Override
    public Matricula atualizar(Matricula matricula01, long id) {
        matricula = matricula01;

        return matricula;
    }

    @Override
    public void deletar(long id) {
    }

    @Override
    public List<Matricula> listar() {
        List<Matricula> listaMatriculas = new ArrayList<>();

        listaMatriculas.add(new Matricula());
        listaMatriculas.add(new Matricula(002l,"01032021", true, aluno, turma));
        listaMatriculas.add(new Matricula(003l,"01022021", true, aluno, turma));

        return listaMatriculas;
    }

    @Override
    public Matricula obter(long id) {

        return matricula;
    }

}
