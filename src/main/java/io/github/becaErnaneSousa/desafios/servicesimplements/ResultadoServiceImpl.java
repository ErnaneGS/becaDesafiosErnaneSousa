package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.entities.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.entities.atividades.Resultado;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.repositories.AlunoRepository;
import io.github.becaErnaneSousa.desafios.repositories.AtividadeRepository;
import io.github.becaErnaneSousa.desafios.repositories.ResultadoRepository;
import io.github.becaErnaneSousa.desafios.servicesinterface.ServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ResultadoServiceImpl implements ServiceInterface<Resultado> {

    private final AlunoRepository alunoRepository;
    private final AtividadeRepository atividadeRepository;
    private final ResultadoRepository resultadoRepository;

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
