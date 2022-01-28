package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.entities.atividades.Resultado;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResultadoServiceImpl implements ServiceInterface<Resultado> {

    Aluno aluno = new Aluno(001l, "Ernane Sousa", "00000000000", "31999999999", "Sousa", "08011992" ,"Jose");
    Atividade atividade = new Atividade(001l,"Atividade de Ingles 01", "Teste do primeiro bimestre", 10.0);
    Resultado resultado = new Resultado(001l,10.0, atividade, aluno);

    @Override
    public Resultado criar(Resultado resultado) {
        System.out.println(resultado);

        return resultado;
    }

    @Override
    public Resultado atualizar(Resultado resultado01, long id) {
        resultado = resultado01;

        return resultado;
    }

    @Override
    public void deletar(long id) {
    }

    @Override
    public List<Resultado> listar() {

        List<Resultado> listaResultados = new ArrayList<>();

        listaResultados.add(new Resultado(002l,8.0, atividade, aluno));
        listaResultados.add(new Resultado(003l,15.0, atividade, aluno));
        listaResultados.add(new Resultado(004l,10.0, atividade, aluno));

        return listaResultados;
    }

    @Override
    public Resultado obter(long id) {

        return resultado;
    }
}
