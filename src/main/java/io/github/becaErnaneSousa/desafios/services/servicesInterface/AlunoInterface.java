package io.github.becaErnaneSousa.desafios.services.servicesInterface;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;
import java.util.List;

public interface AlunoInterface {

    Aluno criar(Aluno aluno);

     Aluno atualizar(Aluno aluno01, long id);

     void deletar(long id);

     List<Aluno> listar();

     Aluno obter(long id);

}
