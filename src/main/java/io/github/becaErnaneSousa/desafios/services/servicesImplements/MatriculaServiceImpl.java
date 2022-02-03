package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.entities.administracao.Turma;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.repositories.AlunoRepository;
import io.github.becaErnaneSousa.desafios.repositories.MatriculaRepository;
import io.github.becaErnaneSousa.desafios.repositories.TurmaRepository;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MatriculaServiceImpl implements ServiceInterface<Matricula> {

    @Autowired
    TurmaRepository turmaRepository;

    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    MatriculaRepository matriculaRepository;

    @Override
    public Matricula criar(Matricula matricula) {

        Turma turmaObtida = turmaRepository.findById(matricula.getTurma().getId()).get();
        matricula.setTurma(turmaObtida);

        Aluno alunoObtido = alunoRepository.findById(matricula.getAluno().getId()).get();
        matricula.setAluno(alunoObtido);

        Matricula matriculaSalva = matriculaRepository.save(matricula);

        return matriculaSalva;

    }

    @Override
    public Matricula atualizar(Matricula matricula, Long id) {

        Matricula matriculaObtida = this.obter(id);
        matriculaObtida.setData(matricula.getData());
        matriculaObtida.setStatus(matricula.isStatus());

        Turma turmaObtida = turmaRepository.findById(matricula.getTurma().getId()).get();
        matricula.setTurma(turmaObtida);

        Aluno alunoObtido = alunoRepository.findById(matricula.getAluno().getId()).get();
        matricula.setAluno(alunoObtido);

        Matricula matriculaSalva = matriculaRepository.save(matricula);

        matriculaRepository.save(matriculaObtida);

        return matricula;
    }

    @Override
    public void deletar(Long id) {
        matriculaRepository.deleteById(id);
    }

    @Override
    public List<Matricula> listar() {

        List<Matricula> listaMatricula = matriculaRepository.findAll();

        return listaMatricula;
    }

    @Override
    public Matricula obter(Long id) {
        Matricula matricula = matriculaRepository.findById(id).get();

        return matricula;
    }

}
