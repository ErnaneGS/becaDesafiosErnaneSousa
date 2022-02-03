package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.entities.atividades.Resultado;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.repositories.AlunoRepository;
import io.github.becaErnaneSousa.desafios.repositories.AtividadeRepository;
import io.github.becaErnaneSousa.desafios.repositories.ResultadoRepository;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResultadoServiceImpl implements ServiceInterface<Resultado> {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private AtividadeRepository atividadeRepository;

    @Autowired
    private ResultadoRepository resultadoRepository;

    @Override
    public Resultado criar(Resultado resultado) {

        Atividade atividadeObtida = atividadeRepository.findById(resultado.getAtividade().getId()).get();
        resultado.setAtividade(atividadeObtida);

        Aluno alunoObtido = alunoRepository.findById(resultado.getAluno().getId()).get();
        resultado.setAluno(alunoObtido);

        Resultado resultadoSalvo = resultadoRepository.save(resultado);

        return resultadoSalvo;
    }

    @Override
    public Resultado atualizar(Resultado resultado, Long id) {

        Resultado resultadoObtido = this.obter(id);

        Atividade atividadeObtida = atividadeRepository.findById(resultado.getAtividade().getId()).get();
        resultado.setAtividade(atividadeObtida);

        Aluno alunoObtido = alunoRepository.findById(resultado.getAluno().getId()).get();
        resultado.setAluno(alunoObtido);

        Resultado resultadoSalvo = resultadoRepository.save(resultado);

        resultadoRepository.save(resultadoObtido);

        return resultado;

    }

    @Override
    public void deletar(Long id) {
        resultadoRepository.deleteById(id);

    }

    @Override
    public List<Resultado> listar() {

        List<Resultado> listaResultado = resultadoRepository.findAll();

        return listaResultado;
    }

    @Override
    public Resultado obter(Long id) {

        Resultado resultado = resultadoRepository.findById(id).get();

        return resultado;

    }
}
