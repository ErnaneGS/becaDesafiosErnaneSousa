package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.administracao.Turma;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Professor;
import io.github.becaErnaneSousa.desafios.repositories.TurmaRepository;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TurmaServiceImpl implements ServiceInterface<Turma> {

    @Autowired
    private ProfessorServiceImpl professorService;

    @Autowired
    private TurmaRepository turmaRepository;

    @Override
    public Turma criar(Turma turma) {

        if (turma.getProfessor() != null) {
            Professor profesorObtido = professorService.obter(turma.getProfessor().getId());
            turma.setProfessor(profesorObtido);

        }

        Turma turmaSalva = turmaRepository.save(turma);
        return turmaSalva;

    }

    @Override
    public Turma atualizar(Turma turma, Long id) {

        Turma turmaObtida = this.obter(id);
        turmaObtida.setNome(turma.getNome());
        turmaObtida.setDataInicio(turma.getDataInicio());
        turmaObtida.setDataFim(turma.getDataFim());
        turmaObtida.setQuantidadeAluno(turma.getQuantidadeAluno());
        turmaObtida.setStatus(turma.isStatus());

        if (turma.getProfessor() != null) {
            Professor profesorObtido = professorService.obter(turma.getProfessor().getId());
            turma.setProfessor(profesorObtido);
        }

        turmaObtida.setProfessor(turma.getProfessor());

        turmaRepository.save(turmaObtida);

        return turma;

    }

    @Override
    public void deletar(Long id) {
        turmaRepository.deleteById(id);
    }

    @Override
    public List<Turma> listar() {

        List<Turma> listaTurma = turmaRepository.findAll();

        return listaTurma;
    }

    @Override
    public Turma obter(Long id) {

        Turma turma = turmaRepository.findById(id).get();

        return turma;

    }

}
